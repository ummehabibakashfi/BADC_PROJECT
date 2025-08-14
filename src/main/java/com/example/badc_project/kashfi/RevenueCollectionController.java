package com.example.badc_project.kashfi;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RevenueCollectionController
{
    @javafx.fxml.FXML
    private TableColumn amountTColumn;
    @javafx.fxml.FXML
    private TableColumn deptTColumn;
    @javafx.fxml.FXML
    private TableView revenueTableView;
    @javafx.fxml.FXML
    private TextField yearTextField;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private TableColumn yearTColumn;
    @javafx.fxml.FXML
    private ComboBox monthComboBox;
    @javafx.fxml.FXML
    private ComboBox deptComboBox;
    @javafx.fxml.FXML
    private TableColumn monthTColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitButtonOnMouseClick(ActionEvent actionEvent) {
    }
}