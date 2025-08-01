package com.example.final_project_2231447;

import java.time.LocalDateTime;

public class SupportTicket {
    private String ticketId;
    private String farmerId; // Linked farmer
    private String officerId; // Assigned officer
    private String issueType; // e.g., "Loan", "Seeds", "Pest"
    private String description;
    private String status; // "Open", "In Progress", "Resolved"
    private LocalDateTime createdAt;
    private LocalDateTime resolvedAt;

    public SupportTicket(String ticketId, String farmerId, String officerId, String issueType, String description, String status, LocalDateTime createdAt, LocalDateTime resolvedAt) {
        this.ticketId = ticketId;
        this.farmerId = farmerId;
        this.officerId = officerId;
        this.issueType = issueType;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.resolvedAt = resolvedAt;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
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

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getResolvedAt() {
        return resolvedAt;
    }

    public void setResolvedAt(LocalDateTime resolvedAt) {
        this.resolvedAt = resolvedAt;
    }

    @Override
    public String toString() {
        return "SupportTicket{" +
                "ticketId='" + ticketId + '\'' +
                ", farmerId='" + farmerId + '\'' +
                ", officerId='" + officerId + '\'' +
                ", issueType='" + issueType + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", createdAt=" + createdAt +
                ", resolvedAt=" + resolvedAt +
                '}';
    }
}
