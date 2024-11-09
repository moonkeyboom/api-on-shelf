package hkt.models;

import hkt.services.enums.ConversationStatus;
import hkt.services.enums.ConversationType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AIConversation {
    private String conversationId;
    private Session session;  // Many-to-One relationship
    private List<Message> messages;  // One-to-Many relationship
    private ConversationType type;  // ประเภทการสนทนา (INTERVIEW, CLARIFICATION)
    private ConversationStatus status;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public AIConversation(Session session, ConversationType type) {
        this.conversationId = UUID.randomUUID().toString();
        this.session = session;
        this.messages = new ArrayList<>();
        this.type = type;
        this.status = ConversationStatus.ACTIVE;
        this.startTime = LocalDateTime.now();
    }

    public String getConversationId() {
        return conversationId;
    }

    public Session getSession() {
        return session;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public ConversationType getType() {
        return type;
    }

    public ConversationStatus getStatus() {
        return status;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setType(ConversationType type) {
        this.type = type;
    }

    public void setStatus(ConversationStatus status) {
        this.status = status;
    }
}
