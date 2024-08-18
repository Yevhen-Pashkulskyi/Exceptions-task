package org.example.newVersion.controller;

import org.example.newVersion.model.InputData;
import org.example.newVersion.view.AppView;

public class AppController {
    public void run (){
        AppView view = new AppView();
        InputData inputData = new InputData();
        view.menu();
        inputData.getData();
    }

}
