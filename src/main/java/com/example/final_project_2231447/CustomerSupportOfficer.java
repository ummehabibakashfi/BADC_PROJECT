package com.example.final_project_2231447;

import java.util.List;

public class CustomerSupportOfficer {
    private String officerId;
    private String name;
    private String email;
    private String phone;
    private String department;
    private List<String> assignedTickets;

    public CustomerSupportOfficer(String officerId, String name, String email, String phone, String department, List<String> assignedTickets) {
        this.officerId = officerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.department = department;
        this.assignedTickets = assignedTickets;
    }

    public String getOfficerId() {
        return officerId;
    }

    public void setOfficerId(String officerId) {
        this.officerId = officerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getAssignedTickets() {
        return assignedTickets;
    }

    public void setAssignedTickets(List<String> assignedTickets) {
        this.assignedTickets = assignedTickets;
    }

    @Override
    public String toString() {
        return "CustomerSupportOfficer{" +
                "officerId='" + officerId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", department='" + department + '\'' +
                ", assignedTickets=" + assignedTickets +
                '}';
    }
}
