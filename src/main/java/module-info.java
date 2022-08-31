module com.example.test3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test3 to javafx.fxml;
    opens test to javafx.fxml;

    exports test;
    exports com.example.test3;
}