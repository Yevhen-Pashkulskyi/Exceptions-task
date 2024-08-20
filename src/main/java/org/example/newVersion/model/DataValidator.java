package org.example.newVersion.model;

import org.example.newVersion.exception.NumberException;
import org.example.newVersion.exception.QuantityException;
import org.example.newVersion.exception.RangeTemperatureException;

public class DataValidator {
    private final String INPUT_REGEX = "^[0-9]*[.,]?[0-9]+$";
    private final int MENU_TASK_ITEMS = 4;
    private final String USD = "$";
    private final int MIN_TEMPERATURE = -10;
    private final int MAX_TEMPERATURE = 35;
    private final String CELSIUS = "°C";

    public String validIntNumber(String number) throws NumberException {
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

    private String validTemperature(int temperature) {
        if (temperature < MIN_TEMPERATURE || temperature > MAX_TEMPERATURE) {
            throw new RangeTemperatureException("\n" + temperature + CELSIUS + " above the norm!\n");
        } else {
            return "\n" + temperature + CELSIUS + " is ok\n";
        }
    }

    public String handleTemperature(int temperature) {
        try {
            return validTemperature(temperature);
        } catch (RangeTemperatureException e) {
            return e.getMessage();
        }
    }
}
