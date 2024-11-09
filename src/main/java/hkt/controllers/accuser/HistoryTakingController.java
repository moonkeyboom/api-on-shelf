package hkt.controllers.accuser;

import hkt.models.Session;
import hkt.models.TestimonyForm;
import hkt.services.FXRouter;
import hkt.services.enums.FormStatus;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Map;

public class HistoryTakingController {
    @FXML private TextField firstnameTextField;
    @FXML private TextField lastnameTextField;
    @FXML private TextField idTextField;
    @FXML private TextField currentAddressTextField;
    @FXML private TextField crimeSceneTextField;

    Session session;

    @FXML
    public void initialize() {
        session = (Session) FXRouter.getData();
    }

    @FXML
    public void onNextButtonClick() {
        //validate input
        String firstname = firstnameTextField.getText().strip();
        String lastname = lastnameTextField.getText().strip();
        String id = idTextField.getText().strip();
        String currentAddress = currentAddressTextField.getText().strip();
        String crimeScene = crimeSceneTextField.getText().strip();

        if (!firstname.isEmpty() && !lastname.isEmpty() && !id.isEmpty() && !currentAddress.isEmpty() && !crimeScene.isEmpty()) {
            //Create testimony
            TestimonyForm testimonyForm = new TestimonyForm(session);
            testimonyForm.getBasicInfo().put("firstname", firstname);
            testimonyForm.getBasicInfo().put("lastname", lastname);
            testimonyForm.getBasicInfo().put("id", id);
            testimonyForm.getBasicInfo().put("currentAddress", currentAddress);
            testimonyForm.getBasicInfo().put("crimeScene", crimeScene);

            try {
                FXRouter.goTo("chat-view", testimonyForm);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
