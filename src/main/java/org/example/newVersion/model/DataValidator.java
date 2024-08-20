package org.example.newVersion.model;

import org.example.newVersion.exception.NumberException;
import org.example.newVersion.exception.QuantityException;

public class DataValidator {
    private final String INPUT_REGEX = "^[0-9]*$";
    private final int MENU_TASK_ITEMS = 4;
    private final String USD = "$";

    public String validateNumber(String number) throws NumberException {
        if (!number.matches(INPUT_REGEX) || number == null || number.isEmpty()) {
            throw new NumberException("Invalid number " + number);
        }
        return number;
    }

    public String validateQuantity(String input) throws QuantityException {
        int res = Integer.parseInt(input);
        if (res > MENU_TASK_ITEMS || res < 0) {
            throw new QuantityException("Invalid quantity " + input);
        }
        return input;
    }

    public void valNumber(String input) {
        try {
            Double.parseDouble(input);
            System.out.println("'" + input + "'" + " являється числом\n");
        } catch (NumberFormatException e) {
            System.out.println("'" + input + "'" + " не являється числом\n");
        }
    }

    public String indexArr(String[] arr, int search) {
        String day = "";
        try {
            day = arr[search - 1].replace("[", "").replace("]", "");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Ціни за " + "'" + search + "'" + " днем не існує");
        }
        return day + " " + USD;
    }
}
