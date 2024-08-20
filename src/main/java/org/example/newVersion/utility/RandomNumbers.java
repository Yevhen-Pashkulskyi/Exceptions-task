package org.example.newVersion.utility;

import java.util.Random;

public class RandomNumbers {
    private final double MIN = 0.01;
    private final double MAX = 100.00;

    public double randomNumbers() {
        return new Random().nextDouble((MAX - MIN) + 1) + MIN;
    }
}
