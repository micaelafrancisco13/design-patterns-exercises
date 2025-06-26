package com.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DataConsumer {
    private final DataSource dataSource;

    public int consume() {
        return dataSource.getData();
    }
}
