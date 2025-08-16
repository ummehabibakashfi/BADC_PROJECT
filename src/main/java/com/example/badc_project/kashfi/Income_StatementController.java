package com.example.badc_project.kashfi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Income_StatementController {

    public class IncomeStatementController {

        @FXML
        private TableColumn<?, ?> expenseTColumn;

        @FXML
        private TextField expenseTextField;

        @FXML
        private TableView<?> incomeStatementTableView;

        @FXML
        private TableColumn<?, ?> incomeTColumn;

        @FXML
        private TextField incomeTextField;

        @FXML
        private TableColumn<?, ?> netProfitTColumn;

        @FXML
        private TableColumn<?, ?> withdrawalTColumn;

        @FXML
        private TextField wthdrawalTextField;

        @FXML
        void netProfitOnMouseClick(ActionEvent event) {

        }

    }
}