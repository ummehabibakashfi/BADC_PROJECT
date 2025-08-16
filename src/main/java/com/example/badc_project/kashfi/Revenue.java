package com.example.badc_project.kashfi;

public class Revenue {
    String department;
    String month;
    String year;
    Integer revenue;

    public Revenue(String department, Integer revenue, String year, String month) {
        this.department = department;
        this.revenue = revenue;
        this.year = year;
        this.month = month;
    }

    public Integer getRevenue() {
        return revenue;
    }

    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
