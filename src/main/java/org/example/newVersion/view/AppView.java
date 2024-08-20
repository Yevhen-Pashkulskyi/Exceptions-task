package org.example.newVersion.view;

public class AppView {
    public void menu(){
        System.out.print("1) Перевірка на наявність числа\n" +
                "2) Пошук ціни\n" +
                "3) Розрахунок\n" +
                "4) Перевірка діапазону температури\n" +
                "0) closed\n");
        System.out.print("Виберіть завдання:");
    }
    public void msgExc(){
        System.out.print("Скільки днів взяти у підрахунок: ");
    }
    public void output(String text){
        System.out.println(text);
    }
}
