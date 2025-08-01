package com.example.badc_project.kashfi;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Income_StatementController
{
    @javafx.fxml.FXML
    private TableView incomeStatementTableView;
    @javafx.fxml.FXML
    private TableColumn expenseTColumn;
    @javafx.fxml.FXML
    private TableColumn incomeTColumn;
    @javafx.fxml.FXML
    private TableColumn withdrawalTColumn;
    @javafx.fxml.FXML
    private TextField wthdrawalTextField;
    @javafx.fxml.FXML
    private TableColumn netProfitTColumn;
    @javafx.fxml.FXML
    private TextField expenseTextField;
    @javafx.fxml.FXML
    private TextField incomeTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void netProfitOnMouseClick(ActionEvent actionEvent) {
    }
}