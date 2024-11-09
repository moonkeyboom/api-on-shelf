package hkt.controllers.police;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class PoliceChatViewController {
    @FXML
    private VBox chatVBox;  // The VBox that contains all chat messages
    @FXML
    private TextArea messageInput;  // The input area for typing messages

    @FXML
    private void onSendMessage() {
        String message = messageInput.getText().trim();
        if (!message.isEmpty()) {
            addMessageToChat("User", message);
            messageInput.clear();
        }
    }

    private void addMessageToChat(String sender, String message) {
        // Create HBox for the message container
        HBox messageHBox = new HBox();
        messageHBox.setSpacing(10);

        // Create TextFlow to wrap the text
        TextFlow textFlow = new TextFlow(new Text(message));
        textFlow.setMaxWidth(300);  // Limit text width
        textFlow.getStyleClass().add("chat-bubble");  // Style for chat bubble

        // Add TextFlow to HBox
        messageHBox.getChildren().add(textFlow);
        messageHBox.setStyle("-fx-alignment: CENTER_LEFT");  // Align left for sender

        // Add HBox to VBox
        chatVBox.getChildren().add(messageHBox);
    }
}
