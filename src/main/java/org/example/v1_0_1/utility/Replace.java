package org.example.v1_0_1.utility;

public class Replace {
    public static String replaceComaToDot(String expense) {
        if (expense.contains(",")) {
            expense = expense.replace(",", ".");
        }
        return expense;
    }

}
