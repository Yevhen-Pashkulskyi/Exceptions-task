package org.example.newVersion.view;

public class AppView {
    public void menu(){
        System.out.print("1) Перевірити чи число це\n" +
                "2) task2\n" +
                "3) task3\n" +
                "4) task4\n");
        System.out.print("Виберіть яке завдання потрібно зробити: ");
    }
    public void output(String text){
        System.out.println(text);
    }
}
