package com.example.badc_project.kashfi;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class BudgetAllocationController
{
    @javafx.fxml.FXML
    private ComboBox budgetTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn amountTColumn;
    @javafx.fxml.FXML
    private TableColumn deptTColumn;
    @javafx.fxml.FXML
    private TableView budgetAllocationTableView;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private ComboBox deptComboBox;
    @javafx.fxml.FXML
    private TableColumn typeTColumn;
    @javafx.fxml.FXML
    private TableColumn dateTColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitButtonOnMouseClick(ActionEvent actionEvent) {
    }
}