module com.example.final_project_2231447 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.final_project_2231447 to javafx.fxml;
    exports com.example.final_project_2231447;
}