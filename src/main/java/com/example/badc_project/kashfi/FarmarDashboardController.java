package com.example.badc_project.kashfi;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FarmarDashboardController
{
    @javafx.fxml.FXML
    private Label SelectitemLabel;
    @javafx.fxml.FXML
    private Label statusmessageherelabel;
    @javafx.fxml.FXML
    private Label FARMERDASHBOARDLabel;
    @javafx.fxml.FXML
    private TextField TexttField;
    @javafx.fxml.FXML
    private ComboBox<String> ComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> ComboBOx;
    @javafx.fxml.FXML
    private Label SelecttypeLabel;
    @javafx.fxml.FXML
    private Label QuantityLabel;
    @javafx.fxml.FXML
    private Label ApplyforSubsidyLabel;
    @javafx.fxml.FXML
    private Label lastlogin30july2025label;

    @javafx.fxml.FXML
    public void initialize() {
        ComboBox.getItem().addAll("Seeds","Fertilizer","Equipment");
        ComboBox.getItems().addAll("WheatSeeds","RiceSeeds","MaizeSeeds");



    }

    @javafx.fxml.FXML
    public void LogoutOnAction(ActionEvent actionEvent) {
        statusmessageherelabel.setText("Logged out successfully");
        System.out.printIn("Logout Clicked");
    }

    @javafx.fxml.FXML
    public void EditProfileOnAction(ActionEvent actionEvent) {
        statusmessageherelabel.setText("Editing profile");
        System.out.println("Edit profile clicked");
    }

    @javafx.fxml.FXML
    public void ViewApplicationOnAction(ActionEvent actionEvent) {
        statusmessageherelabel.setText("Viewing application");
        System.out.println("View Application clicked");
    }

    @javafx.fxml.FXML
    public void ApplyButton(ActionEvent actionEvent) {
        String selectedType= ComboBox.getValue();
        String quantity= TextField.getText();
        if (selectedType==null||quantity.isEmpty()){
            statusmessageherelabel.setText("Please select type and enter quantity");
                       return;

        }
        statusmessageherelabel.setText("Applied for"+quantity+"selectedtype");
        System.out.println("Applied for"+quantity+"of"+selectedType);
    }

    @javafx.fxml.FXML
    public void ApplyForSubsidyOnAction(ActionEvent actionEvent) {
        statusmessageherelabel.setText("Subsidy application submitted");
        System.out.println("Subsidy applied");
    }
}