package com.example.badc_project.kashfi;

import javafx.event.ActionEvent;
import com.badc_project.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class Dashboardcontroller
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleFieldofficer(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXMLSceneSwitcher.switchTo("Abhijeet/SystemAdminGoals.fxml");

}

public void handleCustomerSupport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleMarketingManager(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleFarmer(ActionEvent actionEvent)throws I0Exception {
        SceneSwitcher.switchTo("kashfi/farmer_Dashboard.fxml");
    }

    @javafx.fxml.FXML
    public void handleInventoryManager(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleAccountant(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLogOut(ActionEvent actionEvent) {
    }
}