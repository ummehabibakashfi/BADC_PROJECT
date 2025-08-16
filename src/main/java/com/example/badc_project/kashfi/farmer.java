package com.example.badc_project.kashfi;

public class Farmer {
    private String type;
    private String item;
    private int quantity;
    private String status;

    public Farmer(String type, String item, int quantity, String status) {
        this.type = type;
        this.item = item;
        this.quantity = quantity;
        this.status = status;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "type='" + type + '\'' +
                ", item='" + item + '\'' +
                ", quantity=" + quantity +
                ", status='" + status + '\'' +
                '}';
    }
}

