package org.example.newVersion.model;

import org.example.newVersion.entity.BankAccount;

public class ModelBankAccount {
    public String balanceCalculation(double balance, double expense) {
        try {
            if (balance < expense) {
                throw new ArithmeticException(expense + " більше твого балансу!");
            }
        } catch (ArithmeticException e) {
            return e.getMessage();
        }
        balance = balance - expense;
        return String.format("%.2f", balance);
    }
}
