package com.example.final_project_2231447;

import java.time.LocalDateTime;

public class ResolutionLog {
    private String logId;
    private String ticketId;
    private String resolutionNotes;
    private String officerId;
    private LocalDateTime timestamp;

    public ResolutionLog(String logId, String ticketId, String resolutionNotes, String officerId, LocalDateTime timestamp) {
        this.logId = logId;
        this.ticketId = ticketId;
        this.resolutionNotes = resolutionNotes;
        this.officerId = officerId;
        this.timestamp = timestamp;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getOfficerId() {
        return officerId;
    }

    public void setOfficerId(String officerId) {
        this.officerId = officerId;
    }

    public String getResolutionNotes() {
        return resolutionNotes;
    }

    public void setResolutionNotes(String resolutionNotes) {
        this.resolutionNotes = resolutionNotes;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    @Override
    public String toString() {
        return "ResolutionLog{" +
                "logId='" + logId + '\'' +
                ", ticketId='" + ticketId + '\'' +
                ", resolutionNotes='" + resolutionNotes + '\'' +
                ", officerId='" + officerId + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
