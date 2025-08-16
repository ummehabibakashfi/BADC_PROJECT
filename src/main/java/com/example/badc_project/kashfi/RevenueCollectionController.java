package com.example.badc_project.kashfi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RevenueCollectionController {

    @FXML
    private TableColumn<?, ?> amountTColumn;

    @FXML
    private TextField amountTextField;

    @FXML
    private ComboBox<?> deptComboBox;

    @FXML
    private TableColumn<?, ?> deptTColumn;

    @FXML
    private ComboBox<?> monthComboBox;

    @FXML
    private TableColumn<?, ?> monthTColumn;

    @FXML
    private TableView<?> revenueTableView;

    @FXML
    private TableColumn<?, ?> yearTColumn;

    @FXML
    private TextField yearTextField;

    @FXML
    void submitButtonOnMouseClick(ActionEvent event) {

    }

}
