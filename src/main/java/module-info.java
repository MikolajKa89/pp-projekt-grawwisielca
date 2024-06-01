module com.example.projektgrawwisielca {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.projektgrawwisielca to javafx.fxml;
    exports com.example.projektgrawwisielca;
    exports com.example.grawwisielca;
    opens com.example.grawwisielca to javafx.fxml;
}