package org.example.newVersion.view;

public class AppView {
    public void menu(){
        System.out.print("1) Перевірка на наявність числа\n" +
                "2) Пошук ціни\n" +
                "3) task3\n" +
                "4) task4\n" +
                "0) closed\n");
        System.out.print("Виберіть завдання:");
    }
    public void msgExc(){
        System.out.println("Скільки днів взяти у підрахунок: ");
    }
    public void output(String text){
        System.out.println(text);
    }
}
