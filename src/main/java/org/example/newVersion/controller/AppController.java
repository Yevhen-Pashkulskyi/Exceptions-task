package org.example.newVersion.controller;

import org.example.newVersion.entity.BankAccount;
import org.example.newVersion.entity.StockExchange;
import org.example.newVersion.exception.custom.NumberException;
import org.example.newVersion.exception.DataValidator;
import org.example.newVersion.utility.InputData;
import org.example.newVersion.utility.Replace;
import org.example.newVersion.view.AppView;

public class AppController {
    private InputData inputData;
    private AppView view;

    public void run() {
        view = new AppView();
        inputData = new InputData();
        DataValidator dataValidator = new DataValidator();
        view.menu();
        int choice;
        try {
            choice = Integer.parseInt(dataValidator.handleNumberQuantity(String.valueOf((int) Math.round(Double.parseDouble(inputData.getData())))));
            implementation(choice);
        } catch (NumberFormatException e) {
            System.out.println("\n" + e.getMessage() + "\n");
        }
        run();
    }

    private void implementation(int choice) {
        DataValidator dV = new DataValidator();
        int balance = 100;
        switch (choice) {
            case 1:
                System.out.print("\nВведіть число: ");
                String number = Replace.replaceComaToDot(inputData.getData());
                dV.valNumber(number);
                run();
                break;
            case 2:
                StockExchange se = new StockExchange();
                view.msgExc();
                se.setDay(Integer.parseInt(dV.validIntNumber(inputData.getData())));
                String[] prices = inputData.prices(se.getDay());
                System.out.print("Ціну якого дня знайти: ");
                try {
                    view.output(dV.indexArr(prices,
                            Integer.parseInt(dV.validIntNumber(
                                    Replace.replaceComaToDot(inputData.getData())))));
                } catch (NumberException e) {
                    e.getMessage();
                }
                run();
                break;
            case 3:
                BankAccount ba = new BankAccount();
                ba.setBalance(balance); //Double.parseDouble(dV.validateNumber(inputData.getData())));
                System.out.print("Введіть суму зняття: ");
                view.output(dV.balanceCalculation(ba.getBalance(),
                        Double.parseDouble(dV.validIntNumber(Replace.replaceComaToDot(inputData.getData())))));
                run();
                break;
            case 4:
                System.out.print("Введіть робочу температуру: ");
                view.output(dV.handleTemperature
                        (Integer.parseInt(dV.validIntNumber(inputData.getData()))));
                run();
                break;
            case 0:
                break;
        }
    }

    private String handleDataSingle(String data) {
        DataValidator dv = new DataValidator();
        try {
            return dv.validIntNumber(data);
        } catch (NumberException e) {
            return e.getMessage();
        }
    }
}
