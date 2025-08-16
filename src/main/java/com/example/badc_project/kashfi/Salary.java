package com.example.badc_project.kashfi;

import java.io.Serializable;

public class Salary implements Serializable {
    String employeeid;
    String employeename;
    int contactNumber;
    String dept;
    String salary;

    public Salary(String employeeid, String salary, String dept, int contactNumber, String employeename) {
        this.employeeid = employeeid;
        this.salary = salary;
        this.dept = dept;
        this.contactNumber = contactNumber;
        this.employeename = employeename;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "employeeid='" + employeeid + '\'' +
                ", employeename='" + employeename + '\'' +
                ", contactNumber=" + contactNumber +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}



