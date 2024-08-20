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
        return String.format("\nЗалишок %.2f$\n", balance);
    }

    public String replaceComaToDot(String expense) {
        if (expense.contains(",")) {
            expense = expense.replace(",", ".");
        }
        return expense;
    }

}
