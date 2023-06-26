module com.example.scenetest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scenetest to javafx.fxml;
    exports com.example.scenetest;
}