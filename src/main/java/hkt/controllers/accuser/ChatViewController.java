package hkt.controllers.accuser;

import hkt.models.TestimonyForm;
import hkt.services.FXRouter;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ChatViewController {
    @FXML private TextField answerTextField;
    private TestimonyForm testimonyForm;

    @FXML public void initialize() {
        testimonyForm = (TestimonyForm) FXRouter.getData();

    }

    @FXML public void onSubmitButtonClick() {
        //send text to AI chatbot through API
    }

    @FXML public void onMicrophoneGlyphClick(){
        //record speech and send record.wav through API
    }
}
