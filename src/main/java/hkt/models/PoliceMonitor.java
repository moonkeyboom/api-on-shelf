package hkt.models;

import hkt.services.enums.MonitorStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PoliceMonitor {
    private String monitorId;
    private String policeId;
    private Session session;  // Many-to-One relationship
    private MonitorStatus status;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String feedback;
    private List<String> requiredChanges;

    public PoliceMonitor(String policeId, Session session) {
        this.monitorId = UUID.randomUUID().toString();
        this.policeId = policeId;
        this.session = session;
        this.status = MonitorStatus.MONITORING;
        this.startTime = LocalDateTime.now();
        this.requiredChanges = new ArrayList<>();
    }

    // Getters and setters

    public String getMonitorId() {
        return monitorId;
    }

    public String getPoliceId() {
        return policeId;
    }

    public Session getSession() {
        return session;
    }

    public MonitorStatus getStatus() {
        return status;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getFeedback() {
        return feedback;
    }

    public List<String> getRequiredChanges() {
        return requiredChanges;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setRequiredChanges(List<String> requiredChanges) {
        this.requiredChanges = requiredChanges;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public void setStatus(MonitorStatus status) {
        this.status = status;
    }

    public void setPoliceId(String policeId) {
        this.policeId = policeId;
    }
}