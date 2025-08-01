package com.example.final_project_2231447;

import java.time.LocalDate;

public class PestReport {
    private String reportId;
    private String farmerId;
    private String officerId;
    private String pestType;
    private String affectedCrop;
    private String severity; // "Low", "Medium", "High"
    private LocalDate reportDate;
    private String recommendedAction;
    private String status;

    public PestReport(String reportId, String farmerId, String officerId, String pestType, String affectedCrop, String severity, LocalDate reportDate, String recommendedAction, String status) {
        this.reportId = reportId;
        this.farmerId = farmerId;
        this.officerId = officerId;
        this.pestType = pestType;
        this.affectedCrop = affectedCrop;
        this.severity = severity;
        this.reportDate = reportDate;
        this.recommendedAction = recommendedAction;
        this.status = status;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
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

    public String getPestType() {
        return pestType;
    }

    public void setPestType(String pestType) {
        this.pestType = pestType;
    }

    public String getAffectedCrop() {
        return affectedCrop;
    }

    public void setAffectedCrop(String affectedCrop) {
        this.affectedCrop = affectedCrop;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public String getRecommendedAction() {
        return recommendedAction;
    }

    public void setRecommendedAction(String recommendedAction) {
        this.recommendedAction = recommendedAction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PestReport{" +
                "reportId='" + reportId + '\'' +
                ", farmerId='" + farmerId + '\'' +
                ", officerId='" + officerId + '\'' +
                ", pestType='" + pestType + '\'' +
                ", affectedCrop='" + affectedCrop + '\'' +
                ", severity='" + severity + '\'' +
                ", reportDate=" + reportDate +
                ", recommendedAction='" + recommendedAction + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
