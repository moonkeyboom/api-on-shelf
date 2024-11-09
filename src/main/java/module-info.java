module hkt.dt.aifthackathon2024 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.datatype.jsr310;
    requires com.fasterxml.jackson.databind;
    requires commons;
    requires java.net.http;

    opens hkt.dt.aifthackathon2024 to javafx.fxml;
    exports hkt.dt.aifthackathon2024;
    exports hkt.dt;
    opens hkt.dt to javafx.fxml;

    opens hkt.models;
    opens hkt.controllers.accuser to javafx.fxml;
    exports hkt.controllers.accuser;
    exports hkt.models;

    exports hkt.services.enums to com.fasterxml.jackson.databind;
}