package financialExchange;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] prices = {10.0, 2.1, 15.4, 240.0, 17.7};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введіть індекс пошуку ціни: ");
            int index = scanner.nextInt();

            if(index>=0 && index< prices.length){
                System.out.println("Ціна в індексі " + index + ": " + prices[index]);
            }else {
                System.out.println("Межа пошуку від 0 до " + prices.length + ". Введіть в межах пошуку.");
            }
        } catch (Exception e) {
            System.out.print("Неправильні дані. Введіть дійсний індекс.");
        }
    }
}
