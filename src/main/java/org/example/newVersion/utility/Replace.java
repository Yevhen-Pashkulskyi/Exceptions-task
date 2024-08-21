package org.example.newVersion.utility;

public class Replace {
    public static String replaceComaToDot(String expense) {
        if (expense.contains(",")) {
            expense = expense.replace(",", ".");
        }
        return expense;
    }

}
