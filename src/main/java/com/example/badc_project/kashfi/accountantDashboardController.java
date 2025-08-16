package com.example.badc_project.kashfi;

import com.example.badc_project.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class accountantDashboardController
{

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void incomeStatementOnMouseClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("income_statement.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setScene(scene);
            nextStage.setTitle("Income Statement");
            nextStage.show();
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void reimbursementReportOnMouseClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("expense_reimbursement.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setScene(scene);
            nextStage.setTitle("Reimbursement Report");
            nextStage.show();
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void licensePaymentStatusOnMouseClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("license_payment_status.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setScene(scene);
            nextStage.setTitle("License Payment Status");
            nextStage.show();
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void budgetAllocationOnMouseClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("budget_allocation.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setScene(scene);
            nextStage.setTitle("Budget Allocation");
            nextStage.show();
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void employeeSalaryPaymentOnMouseClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("salary_payment.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setScene(scene);
            nextStage.setTitle("Employee Salary Payment");
            nextStage.show();
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void addInvoiceOnMouseClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("add_invoice.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setScene(scene);
            nextStage.setTitle("Add Invoice");
            nextStage.show();
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void salaryDeclarationOnMouseClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("salary_declaration.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setScene(scene);
            nextStage.setTitle("Salary Declaration");
            nextStage.show();
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void revenueCollectionOnMouseClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("revenue_collection.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setScene(scene);
            nextStage.setTitle("Revenue Collection");
            nextStage.show();
        }
        catch(Exception e){

        }
    }
}