package com.example;

public class Main {
    public static void main(String[] args) {
        var stock = new Stock("PHP");
        var statusBar1 = new StatusBar(stock);
        var statusBar2 = new StatusBar(stock);
        var stockListView1 = new StockListView(stock);
        var stockListView2 = new StockListView(stock);
        stock.registerObserver(statusBar1);
        stock.registerObserver(statusBar2);
        stock.registerObserver(stockListView1);
        stock.registerObserver(stockListView2);
        stock.setPrice(13000);
        stock.setPrice(15000);
    }
}