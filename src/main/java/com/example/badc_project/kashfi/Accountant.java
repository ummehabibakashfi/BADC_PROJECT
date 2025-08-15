package com.example.badc_project.kashfi;

import java.io.*;
import java.util.ArrayList;



public class Accountant implements Serializable {

    public void saveSalaryDeclarationData(Salary salary,String fileName){
        ArrayList<Salary> salaryData = loadSalaryDeclarationData(fileName);
        salaryData.add(salary);

        try{

            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for(Salary i : salaryData){
                oos.writeObject(i);
            }
            oos.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList loadSalaryDeclarationData(String fileName){
        ArrayList<Salary> esalaryData = new ArrayList();

        try{
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true){
                try{

                    Salary data = (Salary) ois.readObject();
                    esalaryData.add(data);

                }catch(Exception e){
                    break;
                }
            }
            ois.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        return esalaryData;
    }

}
package com.example.badc_project.kashfi.;

import java.io.*;
        import java.util.ArrayList;

