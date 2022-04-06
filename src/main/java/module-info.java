module com.javafxcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafxcalculator to javafx.fxml;
    exports com.javafxcalculator;
}