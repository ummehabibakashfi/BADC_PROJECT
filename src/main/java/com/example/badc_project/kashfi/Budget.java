package com.example.badc_project.kashfi;

import java.time.LocalDate;

public class Budget {
    String department;
    String type;
    Integer amount;
    LocalDate date;

    public Budget(String department, LocalDate date, Integer amount, String type) {
        this.department = department;
        this.date = date;
        this.amount = amount;
        this.type = type;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
