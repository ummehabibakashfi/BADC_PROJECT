package com.example.final_project_2231447;

import java.awt.*;

public class FieldOfficer {
    private String officerId;
    private String name;
    private String designation;
    private String assignedRegion;
    private String contactNumber;
    private List assignedFarmers;
    private List recentActivities;

    public FieldOfficer(String officerId, String name, String designation, String assignedRegion, String contactNumber, List<String> assignedFarmers, List<String> recentActivities) {
        this.officerId = officerId;
        this.name = name;
        this.designation = designation;
        this.assignedRegion = assignedRegion;
        this.contactNumber = contactNumber;
        this.assignedFarmers = assignedFarmers;
        this.recentActivities = recentActivities;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAssignedRegion() {
        return assignedRegion;
    }

    public void setAssignedRegion(String assignedRegion) {
        this.assignedRegion = assignedRegion;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public List<String> getAssignedFarmers() {
        return assignedFarmers;
    }

    public void setAssignedFarmers(List assignedFarmers) {
        this.assignedFarmers = assignedFarmers;
    }

    public List<String> getRecentActivities() {
        return recentActivities;
    }

    public void setRecentActivities(List<String> recentActivities) {
        this.recentActivities = recentActivities;
    }

    @Override
    public String toString() {
        return "FieldOfficer{" +
                "officerId='" + officerId + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", assignedRegion='" + assignedRegion + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", assignedFarmers=" + assignedFarmers +
                ", recentActivities=" + recentActivities +
                '}';
    }
}
