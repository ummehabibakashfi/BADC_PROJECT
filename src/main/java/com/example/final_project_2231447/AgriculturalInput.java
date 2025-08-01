package com.example.final_project_2231447;

public class AgriculturalInput {
    private String inputId;
    private String type; // "Seed", "Fertilizer", "Pesticide"
    private String subtype; // "Urea", "Wheat Seed", etc.
    private int currentStock;
    private String unit; // "kg", "liters", "bags"
    private double subsidyRate;

    public AgriculturalInput(String inputId, String type, String subtype, int currentStock, String unit, double subsidyRate) {
        this.inputId = inputId;
        this.type = type;
        this.subtype = subtype;
        this.currentStock = currentStock;
        this.unit = unit;
        this.subsidyRate = subsidyRate;
    }

    public String getInputId() {
        return inputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(int currentStock) {
        this.currentStock = currentStock;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getSubsidyRate() {
        return subsidyRate;
    }

    public void setSubsidyRate(double subsidyRate) {
        this.subsidyRate = subsidyRate;
    }

    @Override
    public String toString() {
        return "AgriculturalInput{" +
                "inputId='" + inputId + '\'' +
                ", type='" + type + '\'' +
                ", subtype='" + subtype + '\'' +
                ", currentStock=" + currentStock +
                ", unit='" + unit + '\'' +
                ", subsidyRate=" + subsidyRate +
                '}';
    }
}
