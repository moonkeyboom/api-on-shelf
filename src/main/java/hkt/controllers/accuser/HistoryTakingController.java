package hkt.controllers.accuser;

import hkt.models.Session;
import hkt.models.TestimonyForm;
import hkt.services.FXRouter;
import javafx.fxml.FXML;

public class HistoryTakingController {
    Session session;

    @FXML
    public void initialize() {
        session = (Session) FXRouter.getData();
    }

    @FXML
    public void onSubmitButtonClick() {
        //validate input


        //Create testimony
        TestimonyForm testimonyForm = new TestimonyForm(session);
    }

    @FXML
    public void onNextButtonClick() {

    }

}
