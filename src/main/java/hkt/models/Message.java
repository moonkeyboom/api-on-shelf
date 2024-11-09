package hkt.models;

import hkt.services.enums.MessageStatus;
import hkt.services.enums.MessageType;

import java.time.LocalDateTime;
import java.util.UUID;

public class Message {
    private String messageId;
    private AIConversation conversation;  // Many-to-One relationship
    private MessageType type;
    private String content;
    private String audioUrl;
    private String transcribedText;
    private LocalDateTime timestamp;
    private MessageStatus status;

    public Message(AIConversation conversation, MessageType type, String content) {
        this.messageId = UUID.randomUUID().toString();
        this.conversation = conversation;
        this.type = type;
        this.content = content;
        this.timestamp = LocalDateTime.now();
        this.status = MessageStatus.SENT;
    }

    // Getters and setters

    public String getMessageId() {
        return messageId;
    }

    public AIConversation getConversation() {
        return conversation;
    }

    public MessageType getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public String getTranscribedText() {
        return transcribedText;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public MessageStatus getStatus() {
        return status;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public void setTranscribedText(String transcribedText) {
        this.transcribedText = transcribedText;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setStatus(MessageStatus status) {
        this.status = status;
    }
}
