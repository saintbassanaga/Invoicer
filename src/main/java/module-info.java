module com.gcode.invoicer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.gcode.invoicer to javafx.fxml;
    exports com.gcode.invoicer;
}