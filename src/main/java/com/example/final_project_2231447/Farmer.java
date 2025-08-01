package com.example.final_project_2231447;

import java.awt.*;

public class Farmer {
    private String farmerId;
    private String name;
    private String nid;
    private String location;
    private List<String> loanIds;

    public Farmer(String farmerId, String name, String nid, String location, List<String> loanIds) {
        this.farmerId = farmerId;
        this.name = name;
        this.nid = nid;
        this.location = location;
        this.loanIds = loanIds;
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

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getLoanIds() {
        return loanIds;
    }

    public void setLoanIds(List<String> loanIds) {
        this.loanIds = loanIds;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "farmerId='" + farmerId + '\'' +
                ", name='" + name + '\'' +
                ", nid='" + nid + '\'' +
                ", location='" + location + '\'' +
                ", loanIds=" + loanIds +
                '}';
    }
}
