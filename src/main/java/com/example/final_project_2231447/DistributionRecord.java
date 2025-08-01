package com.example.final_project_2231447;

import java.time.LocalDate;

public class DistributionRecord {
    private String distributionId;
    private String farmerId;
    private String officerId;
    private String inputId;
    private double distributedQuantity;
    private LocalDate distributionDate;
    private String receiptNumber;

    public DistributionRecord(String distributionId, String farmerId, String officerId, String inputId, double distributedQuantity, LocalDate distributionDate, String receiptNumber) {
        this.distributionId = distributionId;
        this.farmerId = farmerId;
        this.officerId = officerId;
        this.inputId = inputId;
        this.distributedQuantity = distributedQuantity;
        this.distributionDate = distributionDate;
        this.receiptNumber = receiptNumber;
    }

    public String getDistributionId() {
        return distributionId;
    }

    public void setDistributionId(String distributionId) {
        this.distributionId = distributionId;
    }

    public String getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(String farmerId) {
        this.farmerId = farmerId;
    }

    public String getOfficerId() {
        return officerId;
    }

    public void setOfficerId(String officerId) {
        this.officerId = officerId;
    }

    public String getInputId() {
        return inputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    public double getDistributedQuantity() {
        return distributedQuantity;
    }

    public void setDistributedQuantity(double distributedQuantity) {
        this.distributedQuantity = distributedQuantity;
    }

    public LocalDate getDistributionDate() {
        return distributionDate;
    }

    public void setDistributionDate(LocalDate distributionDate) {
        this.distributionDate = distributionDate;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    @Override
    public String toString() {
        return "DistributionRecord{" +
                "distributionId='" + distributionId + '\'' +
                ", farmerId='" + farmerId + '\'' +
                ", officerId='" + officerId + '\'' +
                ", inputId='" + inputId + '\'' +
                ", distributedQuantity=" + distributedQuantity +
                ", distributionDate=" + distributionDate +
                ", receiptNumber='" + receiptNumber + '\'' +
                '}';
    }
}
