package org.example.newVersion.model;

import java.util.Scanner;

public class InputData {
    public String getData(){
        return new Scanner(System.in).nextLine().trim();
    }
}
