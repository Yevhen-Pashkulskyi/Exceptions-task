package org.example.newVersion.controller;

import org.example.newVersion.exception.NumberException;
import org.example.newVersion.exception.QuantityException;
import org.example.newVersion.model.DataValidator;
import org.example.newVersion.model.InputData;
import org.example.newVersion.view.AppView;

public class AppController {

    public void run() {
        AppView view = new AppView();
        InputData inputData = new InputData();
        view.menu();
        int choice = Integer.parseInt(handleData(inputData.getData()));
        implementation(choice);
    }

    private void implementation(int choice){

    }

    private String handleData(String data) {
        DataValidator dv = new DataValidator();
        try {
            return dv.validateQuantity(dv.validateNumber(data));
        } catch (NumberException | QuantityException e) {
            return e.getMessage();
        }
    }
}
