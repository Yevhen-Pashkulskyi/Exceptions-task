package org.example.newVersion.controller;

import org.example.newVersion.exception.NumberException;
import org.example.newVersion.exception.QuantityException;
import org.example.newVersion.model.DataValidator;
import org.example.newVersion.model.InputData;
import org.example.newVersion.view.AppView;

public class AppController {
    InputData inputData;
    AppView view;

    public void run() {
        view = new AppView();
        inputData = new InputData();
        view.menu();
        int choice = Integer.parseInt(handleDataNumberQuantity(inputData.getData()));
        implementation(choice);
    }

    private void implementation(int choice) throws NumberException {
        DataValidator dV = new DataValidator();
        String data;
        switch (choice) {
            case 1:
                System.out.print("\nВведіть число: ");
                String number = inputData.getData();
                try {
                    handleDataSingle(number);
                    System.out.println("This valid number: " + number);
                }catch (NumberException e){
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                view.output(dV.validateQuantity(inputData.getData()));
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
