package hkt.services;

import hkt.models.AIConversation;
import hkt.models.Message;
import hkt.models.Session;
import hkt.services.enums.ConversationType;
import hkt.services.enums.MessageType;

import java.util.List;

public class AIService {

    public AIConversation createConversation(Session session, ConversationType type){
        AIConversation conversation = new AIConversation(session, type);
        return conversation;
    }

    public Message processAIResponse(AIConversation conversation, String userMessage) {
        Message userMessageEntity = new Message(conversation, MessageType.USER, userMessage);
        return userMessageEntity;
    }

    public String generateAISummary(List<Message> messages) {
        return "";
    }


}
