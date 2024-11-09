package hkt.models;

import hkt.services.enums.FormStatus;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TestimonyForm {
    private String formId;
    private Session session;  // One-to-One relationship
    private Map<String, String> basicInfo;  // ข้อมูลพื้นฐาน เช่น ชื่อ-นามสกุล, เลขบัตรประชาชน
    private String incidentDescription;  // คำอธิบายเหตุการณ์
    private String aiSummary;  // สรุปจาก AI
    private FormStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime lastModified;
    private String policeNotes;  // บันทึกเพิ่มเติมจากตำรวจ

    public TestimonyForm(Session session) {
        this.formId = UUID.randomUUID().toString();
        this.session = session;
        this.basicInfo = new HashMap<>();
        this.status = FormStatus.DRAFT;
        this.createdAt = LocalDateTime.now();
        this.lastModified = this.createdAt;
    }

    // Getters and setters

    public String getPoliceNotes() {
        return policeNotes;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public FormStatus getStatus() {
        return status;
    }

    public String getAiSummary() {
        return aiSummary;
    }

    public String getIncidentDescription() {
        return incidentDescription;
    }

    public Map<String, String> getBasicInfo() {
        return basicInfo;
    }

    public Session getSession() {
        return session;
    }

    public String getFormId() {
        return formId;
    }

    public void setIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
    }

    public void setBasicInfo(Map<String, String> basicInfo) {
        this.basicInfo = basicInfo;
    }

    public void setAiSummary(String aiSummary) {
        this.aiSummary = aiSummary;
    }

    public void setStatus(FormStatus status) {
        this.status = status;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public void setPoliceNotes(String policeNotes) {
        this.policeNotes = policeNotes;
    }
}
