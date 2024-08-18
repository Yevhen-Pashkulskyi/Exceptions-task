package org.example.v1_0_0.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть число: ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("Введене число: " + number);
        } catch (NumberFormatException e) {
            System.out.print("Неправильні дані. Введіть дійсний номер.");
        }
    }
}
