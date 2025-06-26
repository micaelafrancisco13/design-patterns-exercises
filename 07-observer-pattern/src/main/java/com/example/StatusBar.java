package com.example;

public class StatusBar implements Observer {
    private final Stock stock;

    public StatusBar(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void update() {
        System.out.println("Status bar updated: " + stock.getPrice());
    }
}
