module com.example.javafxlab {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens com.example.javafxlab to javafx.fxml;
    exports com.example.javafxlab;
}