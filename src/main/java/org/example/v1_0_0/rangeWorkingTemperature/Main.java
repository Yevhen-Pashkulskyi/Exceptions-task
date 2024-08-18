package org.example.v1_0_0.rangeWorkingTemperature;

import org.example.v1_0_0.exceptions.TemperatureOutOfRangeException;

import java.util.Scanner;

public class Main {
    private static final int MIN_TEMPERATURE = -10;
    private static final int MAX_TEMPERATURE = 35;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть поточну температуру: ");
            int temperature = scanner.nextInt();

            if (temperature < -MIN_TEMPERATURE || temperature > MAX_TEMPERATURE) {
                throw new TemperatureOutOfRangeException("Пристрій не може працювати поза діапазоном температур від " +
                        MIN_TEMPERATURE + " до +" + MAX_TEMPERATURE);

            } else {
                System.out.println("Прилад працює, температура: " + temperature);
            }
        } catch (TemperatureOutOfRangeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Неправильні дані. Введіть дійсну температуру.");
        }
    }
}
