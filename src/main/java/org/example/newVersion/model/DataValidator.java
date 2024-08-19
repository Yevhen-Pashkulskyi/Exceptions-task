package org.example.newVersion.model;

import org.example.newVersion.exception.NumberException;
import org.example.newVersion.exception.QuantityException;

public class DataValidator {
    private final String INPUT_REGEX = "^[0-9]*$";
    private final int MENU_TASK_ITEMS = 4;

    public String validateNumber(String number) throws NumberException {
        if (!number.matches(INPUT_REGEX)) {
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
}
