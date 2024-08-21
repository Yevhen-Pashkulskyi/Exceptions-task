package org.example.newVersion.exception;

import org.example.newVersion.exception.custom.NumberException;
import org.example.newVersion.exception.custom.QuantityException;
import org.example.newVersion.exception.custom.RangeTemperatureException;

public class DataValidator {
    private final String INPUT_REGEX = "^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$";
    private final int MENU_TASK_ITEMS = 4;
    private final String USD = "$";
    private final int MIN_TEMPERATURE = -10;
    private final int MAX_TEMPERATURE = 35;
    private final String CELSIUS = "°C";

    public String validIntNumber(String number) {
        if (!number.matches(INPUT_REGEX)) {
            throw new NumberException("Invalid number " + number);
        }
        return number;
    }

    private String validateQuantity(String input) {
        int res = Integer.parseInt(input);
        if (res > MENU_TASK_ITEMS || res < 0) {
            throw new QuantityException("Invalid quantity " + input);
        }
        return input;
    }

    public String handleNumberQuantity(String data) {
        try {
            return validateQuantity(validIntNumber(data));
        } catch (NumberException | QuantityException e) {
            return e.getMessage();
        }
    }

    public void valNumber(String input) {
        try {
            Double.parseDouble(input);
            System.out.println("\n'" + input + "'" + " являється числом\n");
        } catch (NumberFormatException e) {
            System.out.println("\n'" + input + "'" + " не являється числом\n");
        }
    }

    public String indexArr(String[] arr, int search) {
        String day = "";
        try {
            day = arr[search - 1].replace("[", "").replace("]", "");
            return "\n" + day + " " + USD + "\n";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("\nЦіни " + "'" + search + "'" + " дня не існує\n");
        }
        return "";
    }

    private String validTemperature(int temperature) {
        if (temperature > MAX_TEMPERATURE) {
            throw new RangeTemperatureException("\n" + temperature + CELSIUS + " занадто висока, вимкніть обладнання!\n");
        } else if (temperature < MIN_TEMPERATURE) {
            throw new RangeTemperatureException("\n" + temperature + CELSIUS + " занадто низька, вимкніть обладнання!\n");
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

    public String balanceCalculation(double balance, double expense) {
        try {
            if (balance < expense) {
                throw new ArithmeticException("\nНевдача!\nЦе більше твого балансу!\n");
            }
        } catch (ArithmeticException e) {
            return e.getMessage();
        }
        balance = balance - expense;
        return String.format("\nЗалишок %.2f$\n", balance);
    }
}
