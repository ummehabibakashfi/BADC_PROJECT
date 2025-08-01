package com.example.final_project_2231447;

import java.time.LocalDate;

public class Loan {
    private String loanId;
    private String farmerId;
    private double amount;
    private double interestRate;
    private String status; // "Pending", "Approved", "Rejected"
    private LocalDate applicationDate;

    public Loan(String loanId, String farmerId, double amount, double interestRate, String status, LocalDate applicationDate) {
        this.loanId = loanId;
        this.farmerId = farmerId;
        this.amount = amount;
        this.interestRate = interestRate;
        this.status = status;
        this.applicationDate = applicationDate;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(String farmerId) {
        this.farmerId = farmerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanId='" + loanId + '\'' +
                ", farmerId='" + farmerId + '\'' +
                ", amount=" + amount +
                ", interestRate=" + interestRate +
                ", status='" + status + '\'' +
                ", applicationDate=" + applicationDate +
                '}';
    }
}
