package org.example.newVersion.controller;

import org.example.newVersion.model.InputData;
import org.example.newVersion.view.AppView;

public class AppController {
    public void run() {
        AppView view = new AppView();
        InputData inputData = new InputData();
        view.menu();
        validateNumber(new InputData().getData());
    }

    private void validateNumber(String number) {
        try {
            Integer.parseInt(number);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number " + number);
        }
    }
}
