module hkt.dt.aifthackathon2024 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens hkt.dt.aifthackathon2024 to javafx.fxml;
    exports hkt.dt.aifthackathon2024;
}