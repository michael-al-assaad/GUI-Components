module com.michaelalassaad.components {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.michaelalassaad.components to javafx.fxml;
    exports com.michaelalassaad.components;
}