package org.example.newVersion.utility;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InputData {

    public String getData() {
        return new Scanner(System.in).nextLine().trim();
    }

    public String[] prices(int day){
        String[] prices = new String[day];
        for(int i = 0; i < day; i++){
            prices[i] = new DecimalFormat("#.##")
                    .format(new RandomNumbers().randomNumbers());
        }
        return prices;
    }
}
