package org.example.newVersion.view;

public class AppView {
    public void menu(){
        System.out.print("1) Перевірка на наявність числа\n" +
                "2) Пошук ціни в конкретний день\n" +
                "3) Розрахунок банковского рахунку\n" +
                "4) Перевірка діапазону температури\n" +
                "0) closed\n");
        System.out.print("Виберіть завдання:");
    }
    public void msgExc(){
        System.out.print("Який діапазон днів: ");
    }
    public void output(String text){
        System.out.println(text);
    }
}
