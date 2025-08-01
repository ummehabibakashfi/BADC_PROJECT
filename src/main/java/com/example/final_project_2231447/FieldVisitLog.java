package com.example.final_project_2231447;

import java.awt.*;
import java.time.LocalDate;

public class FieldVisitLog {
    private String visitId;
    private String officerId;
    private String farmerId;
    private LocalDate visitDate;
    private String observations;
    private String recommendations;
    private List photos;

    public FieldVisitLog(String visitId, String officerId, String farmerId, LocalDate visitDate, String observations, String recommendations, List photos) {
        this.visitId = visitId;
        this.officerId = officerId;
        this.farmerId = farmerId;
        this.visitDate = visitDate;
        this.observations = observations;
        this.recommendations = recommendations;
        this.photos = photos;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getOfficerId() {
        return officerId;
    }

    public void setOfficerId(String officerId) {
        this.officerId = officerId;
    }

    public String getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(String farmerId) {
        this.farmerId = farmerId;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }

    public List getPhotos() {
        return photos;
    }

    public void setPhotos(List photos) {
        this.photos = photos;
    }

    @Override
    public String toString() {
        return "FieldVisitLog{" +
                "visitId='" + visitId + '\'' +
                ", officerId='" + officerId + '\'' +
                ", farmerId='" + farmerId + '\'' +
                ", visitDate=" + visitDate +
                ", observations='" + observations + '\'' +
                ", recommendations='" + recommendations + '\'' +
                ", photos=" + photos +
                '}';
    }
}
