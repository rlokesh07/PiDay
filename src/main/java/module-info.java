module org.example.piday {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.piday to javafx.fxml;
    exports org.example.piday;
}