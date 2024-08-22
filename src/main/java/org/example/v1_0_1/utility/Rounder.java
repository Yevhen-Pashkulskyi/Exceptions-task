package org.example.v1_0_1.utility;

import java.text.DecimalFormat;

public class Rounder {
    public static String rounderValue(double value) {
        return new DecimalFormat("#.##").format(value);
    }
}
