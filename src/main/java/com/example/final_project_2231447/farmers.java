package com.example.final_project_2231447;

import java.util.List;

public class farmers {
    private String farmerId;
    private String name;
    private String nidNumber;
    private String farmLocation;
    private double landArea; // in acres
    private String primaryCrop;
    private List<String> receivedSubsidies; // Subsidy IDs
    private List<String> pestReports;

    public farmers(String farmerId, String name, String nidNumber, String farmLocation, double landArea, String primaryCrop, List<String> receivedSubsidies, List<String> pestReports) {
        this.farmerId = farmerId;
        this.name = name;
        this.nidNumber = nidNumber;
        this.farmLocation = farmLocation;
        this.landArea = landArea;
        this.primaryCrop = primaryCrop;
        this.receivedSubsidies = receivedSubsidies;
        this.pestReports = pestReports;
    }

    public String getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(String farmerId) {
        this.farmerId = farmerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNidNumber() {
        return nidNumber;
    }

    public void setNidNumber(String nidNumber) {
        this.nidNumber = nidNumber;
    }

    public String getFarmLocation() {
        return farmLocation;
    }

    public void setFarmLocation(String farmLocation) {
        this.farmLocation = farmLocation;
    }

    public double getLandArea() {
        return landArea;
    }

    public void setLandArea(double landArea) {
        this.landArea = landArea;
    }

    public String getPrimaryCrop() {
        return primaryCrop;
    }

    public void setPrimaryCrop(String primaryCrop) {
        this.primaryCrop = primaryCrop;
    }

    public List<String> getReceivedSubsidies() {
        return receivedSubsidies;
    }

    public void setReceivedSubsidies(List<String> receivedSubsidies) {
        this.receivedSubsidies = receivedSubsidies;
    }

    public List<String> getPestReports() {
        return pestReports;
    }

    public void setPestReports(List<String> pestReports) {
        this.pestReports = pestReports;
    }

    @Override
    public String toString() {
        return "farmers{" +
                "farmerId='" + farmerId + '\'' +
                ", name='" + name + '\'' +
                ", nidNumber='" + nidNumber + '\'' +
                ", farmLocation='" + farmLocation + '\'' +
                ", landArea=" + landArea +
                ", primaryCrop='" + primaryCrop + '\'' +
                ", receivedSubsidies=" + receivedSubsidies +
                ", pestReports=" + pestReports +
                '}';
    }
}
