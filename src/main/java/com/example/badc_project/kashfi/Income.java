package com.example.badc_project.kashfi;

public class Income {
    public class Income {
        Integer totalIncome;
        Integer totalExpense;
        Integer withdrawal;
        Integer totalNetProfit;

        public Income(Integer totalIncome, Integer totalNetProfit, Integer withdrawal, Integer totalExpense) {
            this.totalIncome = totalIncome;
            this.totalNetProfit = totalNetProfit;
            this.withdrawal = withdrawal;
            this.totalExpense = totalExpense;
        }

        public Integer getTotalIncome() {
            return totalIncome;
        }

        public void setTotalIncome(Integer totalIncome) {
            this.totalIncome = totalIncome;
        }

        public Integer getTotalNetProfit() {
            return totalNetProfit;
        }

        public void setTotalNetProfit(Integer totalNetProfit) {
            this.totalNetProfit = totalNetProfit;
        }

        public Integer getWithdrawal() {
            return withdrawal;
        }

        public void setWithdrawal(Integer withdrawal) {
            this.withdrawal = withdrawal;
        }

        public Integer getTotalExpense() {
            return totalExpense;
        }

        public void setTotalExpense(Integer totalExpense) {
            this.totalExpense = totalExpense;
        }
    }

}
