package com.example.file.formats;

import com.example.handlers.DataReaderHandler;

public class NumbersReader extends DataReaderHandler {
    public NumbersReader(DataReaderHandler next) {
        super(next);
    }

    @Override
    protected String getFileNameExtension() {
        return FileFormatExtension.NUMBERS.name().toLowerCase();
    }

    @Override
    protected void doHandle(String fileName) {
        System.out.println("Reading data from a Numbers spreadsheet.");
    }
}
