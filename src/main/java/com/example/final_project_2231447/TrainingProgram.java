package com.example.final_project_2231447;

import java.awt.*;
import java.time.LocalDate;

public class TrainingProgram {
    private String programId;
    private String topic;
    private String location;
    private LocalDate trainingDate;
    private List attendingFarmers; // Farmer IDs
    private String officerInCharge;
    private int durationHours;

    public TrainingProgram(String programId, String topic, String location, LocalDate trainingDate, List attendingFarmers, String officerInCharge, int durationHours) {
        this.programId = programId;
        this.topic = topic;
        this.location = location;
        this.trainingDate = trainingDate;
        this.attendingFarmers = attendingFarmers;
        this.officerInCharge = officerInCharge;
        this.durationHours = durationHours;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getTrainingDate() {
        return trainingDate;
    }

    public void setTrainingDate(LocalDate trainingDate) {
        this.trainingDate = trainingDate;
    }

    public List getAttendingFarmers() {
        return attendingFarmers;
    }

    public void setAttendingFarmers(List attendingFarmers) {
        this.attendingFarmers = attendingFarmers;
    }

    public String getOfficerInCharge() {
        return officerInCharge;
    }

    public void setOfficerInCharge(String officerInCharge) {
        this.officerInCharge = officerInCharge;
    }

    public int getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(int durationHours) {
        this.durationHours = durationHours;
    }

    @Override
    public String toString() {
        return "TrainingProgram{" +
                "programId='" + programId + '\'' +
                ", topic='" + topic + '\'' +
                ", location='" + location + '\'' +
                ", trainingDate=" + trainingDate +
                ", attendingFarmers=" + attendingFarmers +
                ", officerInCharge='" + officerInCharge + '\'' +
                ", durationHours=" + durationHours +
                '}';
    }
}
