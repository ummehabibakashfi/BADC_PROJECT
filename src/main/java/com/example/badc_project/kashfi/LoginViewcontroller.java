package com.example.badc_project.kashfi;

import com.badc_project.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;

public class LoginViewController {

    @FXML
    private TextField userNameTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private Label messageLabel;

    @FXML
    public void logInButtonOnClick(ActionEvent actionEvent) throws IOException {
        String inputUsername = userNameTextField.getText().trim();
        String inputPassword = passwordTextField.getText().trim();

        for (User user : UserManager.getUserList()) {
            if (user.getUserName().equals(inputUsername) && user.getPassword().equals(inputPassword)) {
                messageLabel.setText("Login successful! Welcome, " + user.getUserName());
                SceneSwitcher.switchToDashboard();
                return;
            }
        }
        messageLabel.setText("Invalid username or password.");
    }
}