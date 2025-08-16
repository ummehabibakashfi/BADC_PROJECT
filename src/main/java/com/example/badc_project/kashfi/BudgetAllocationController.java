package com.example.badc_project.kashfi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class BudgetAllocationController {

    @FXML
    private TableColumn<?, ?> amountTColumn;

    @FXML
    private TextField amountTextField;

    @FXML
    private TableView<?> budgetAllocationTableView;

    @FXML
    private ComboBox<?> budgetTypeComboBox;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TableColumn<?, ?> dateTColumn;

    @FXML
    private ComboBox<?> deptComboBox;

    @FXML
    private TableColumn<?, ?> deptTColumn;

    @FXML
    private TableColumn<?, ?> typeTColumn;

    @FXML
    void submitButtonOnMouseClick(ActionEvent event) {

    }

}
