module com.example.project_dev {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.project_dev to javafx.fxml;
    exports com.example.project_dev;
}