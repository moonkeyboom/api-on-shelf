module hkt.dt.aifthackathon2024 {
    requires javafx.controls;
    requires javafx.fxml;
    requires grpc.api;
    requires grpc.stub;

    opens hkt.dt.aifthackathon2024 to javafx.fxml;
    exports hkt.dt.aifthackathon2024;
    exports hkt.dt;
    opens hkt.dt to javafx.fxml;
}