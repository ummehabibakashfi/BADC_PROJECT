module com.example.badc_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.badc_project to javafx.fxml;
    exports com.example.badc_project;
    exports com.example.badc_project.kashfi;
    opens com.example.badc_project.kashfi to javafx.fxml;
}