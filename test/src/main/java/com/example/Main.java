package com.example;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        dataSource.setData(10);
        var dataConsumer = new DataConsumer(dataSource);
        System.out.println("Data: " + dataConsumer.consume());
        dataSource.setData(20);
        System.out.println("Data: " + dataConsumer.consume());
    }
}