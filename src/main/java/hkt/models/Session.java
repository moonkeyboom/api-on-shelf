package hkt.models;

import hkt.services.enums.SessionStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Session {
    private String sessionId;
    private String selectedLanguage;
    private SessionStatus status;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private TestimonyForm testimonyForm;  // One-to-One
    private List<AIConversation> conversations;  // One-to-Many
    private String policeOfficerId;  // รหัสเจ้าหน้าที่ที่กำลังตรวจสอบ

    public Session(String selectedLanguage) {
        this.sessionId = UUID.randomUUID().toString();
        this.selectedLanguage = selectedLanguage;
        this.status = SessionStatus.ACTIVE;
        this.startTime = LocalDateTime.now();
        this.conversations = new ArrayList<>();
    }

    // Getters and setters

    public String getSessionId() {
        return sessionId;
    }

    public String getSelectedLanguage() {
        return selectedLanguage;
    }

    public SessionStatus getStatus() {
        return status;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public TestimonyForm getTestimonyForm() {
        return testimonyForm;
    }

    public List<AIConversation> getConversations() {
        return conversations;
    }

    public String getPoliceOfficerId() {
        return policeOfficerId;
    }

    public void setSelectedLanguage(String selectedLanguage) {
        this.selectedLanguage = selectedLanguage;
    }

    public void setStatus(SessionStatus status) {
        this.status = status;
    }

    public void setTestimonyForm(TestimonyForm testimonyForm) {
        this.testimonyForm = testimonyForm;
    }

    public void setConversations(List<AIConversation> conversations) {
        this.conversations = conversations;
    }

    public void setPoliceOfficerId(String policeOfficerId) {
        this.policeOfficerId = policeOfficerId;
    }
}
