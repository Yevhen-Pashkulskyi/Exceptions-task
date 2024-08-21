package org.example.newVersion.utility;

import java.text.DecimalFormat;

public class Rounder {
    public static String rounderValue(double value) {
        return new DecimalFormat("#.##").format(value);
    }
}
