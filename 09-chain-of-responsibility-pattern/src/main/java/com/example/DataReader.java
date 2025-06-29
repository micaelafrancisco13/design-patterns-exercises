package com.example;

import com.example.handlers.DataReaderHandler;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DataReader {
    private final DataReaderHandler dataReaderHandler;

    public void read(String fileName) {
        if (dataReaderHandler != null)
            dataReaderHandler.handle(fileName);
    }
}
