package com.example;

public class StockListView implements Observer {
    private final Stock stock;

    public StockListView(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void update() {
        System.out.println("Stock list view updated: " + stock.getPrice());
    }
}
