package java.org.example.oldVersion.bankAccount;

import java.org.example.oldVersion.exceptions.InsufficientFundsException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int accountBalance = 10000;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть суму для оплати: ");
            double amount = scanner.nextDouble();

            if (amount > accountBalance) {
                throw new InsufficientFundsException("Недостатньо коштів на карті.");
            } else {
                accountBalance -= amount;
                System.out.println("Оплата успішна. Залишковий баланс: " + accountBalance);
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Неправильні дані. Введіть дійсну суму.");
        }
    }
}
