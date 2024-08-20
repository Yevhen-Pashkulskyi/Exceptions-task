package org.example.newVersion.controller;

import org.example.newVersion.entity.BankAccount;
import org.example.newVersion.entity.StockExchange;
import org.example.newVersion.exception.NumberException;
import org.example.newVersion.exception.QuantityException;
import org.example.newVersion.model.DataValidator;
import org.example.newVersion.model.ModelBankAccount;
import org.example.newVersion.utility.InputData;
import org.example.newVersion.view.AppView;

public class AppController {
    private InputData inputData;
    private AppView view;

    public void run() {
        view = new AppView();
        inputData = new InputData();
        view.menu();
        int choice = Integer.parseInt(handleDataNumberQuantity(inputData.getData()));
        implementation(choice);
    }

    private void implementation(int choice) {
        DataValidator dV = new DataValidator();
        switch (choice) {
            case 1:
                System.out.print("\nВведіть число: ");
                dV.valNumber(inputData.getData());
                run();
                break;
            case 2:
                StockExchange se = new StockExchange();
                view.msgExc();
                se.setDay(Integer.parseInt(dV.validateNumber(inputData.getData())));
                String[] prices = inputData.prices(se.getDay());
                System.out.print("Ціну якого дня знайти: ");
                try {
                    view.output(dV.indexArr(prices, Integer.parseInt(dV.validateNumber(inputData.getData()))));
                } catch (NumberException e) {
                    e.getMessage();
                }
                run();
                break;
            case 3:
                BankAccount ba = new BankAccount();
                ModelBankAccount mba = new ModelBankAccount();
                ba.setBalance(100); //Double.parseDouble(dV.validateNumber(inputData.getData())));
                System.out.print("Enter sum: ");
                view.output(mba.balanceCalculation(ba.getBalance(),
                        Double.parseDouble(dV.validateNumber(inputData.getData()))));
                run();
                break;
            case 4:
                System.out.print("Enter temperature: ");
                view.output(dV.handleTemperature
                        (Integer.parseInt(dV.validateNumber(inputData.getData()))));
                run();
                break;
            case 0:
                break;
        }
    }

    private String handleDataNumberQuantity(String data) {
        DataValidator dv = new DataValidator();
        try {
            return dv.validateQuantity(dv.validateNumber(data));
        } catch (NumberException | QuantityException e) {
            return e.getMessage();
        }
    }

    private String handleDataSingle(String data) {
        DataValidator dv = new DataValidator();
        try {
            return dv.validateNumber(data);
        } catch (NumberException e) {
            return e.getMessage();
        }
    }
}
