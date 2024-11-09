package hkt.dt.aifthackathon2024;

import hkt.services.FXRouter;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication  extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXRouter.bind(this, stage, "CS211 Project", 1100, 600);
        configRoutes();
        FXRouter.goTo("accuser-history-taking");
    }

    private void configRoutes() {
        String viewPath = "hkt/dt/aifthackathon2024/views/";


//        FXRouter.when("creator", viewPath + "hello-view.fxml");
        FXRouter.when("accuser-history-taking", viewPath + "accuser/history-taking.fxml");

    }

    public static void main(String[] args) {
        launch();
    }

    }
