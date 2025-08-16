package com.example.badc_project.kashfi;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private static List<User> userList = new ArrayList<>();
    private static final String filename = "data/user.bin";

    public static List<User> getUserList() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename));) {
            UserManager.userList = (List<User>) inputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(userList);

        return userList;
    }

    public static void saveToFile() {
        userList.add(new User("Farmerr", "kashfi", "888", 26));
        userList.add(new User("InventoryManager", "Badhan", "555", 20));
        userList.add(new User("CustomerSupporter", "AbhijeetDas", "444", 18));

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(userList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
