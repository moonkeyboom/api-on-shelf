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
        FXRouter.goTo("login");
    }

    private void configRoutes() {
        String viewPath = "hkt/dt/aifthackathon2024/views/";


        FXRouter.when("creator", viewPath + "hello-view.fxml");

    }

    public static void main(String[] args) {
        launch();
    }

    }
