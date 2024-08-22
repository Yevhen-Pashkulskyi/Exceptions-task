package org.example.v1_0_1.entity;

public class StockExchange {
    private double price;
    private int day;

    public int getDay() {
        return day;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
