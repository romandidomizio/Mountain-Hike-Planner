module csci.ooad.mountainhikeplanner {
    requires java.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;
    requires org.slf4j;
    requires ch.qos.logback.classic;

    opens csci.ooad.mountainhikeplanner to javafx.fxml, com.fasterxml.jackson.databind, org.slf4j;
    exports csci.ooad.mountainhikeplanner;
}
