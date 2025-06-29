package com.example.file.formats;

import com.example.handlers.DataReaderHandler;

public class QuickbooksReader extends DataReaderHandler {
    public QuickbooksReader(DataReaderHandler next) {
        super(next);
    }

    @Override
    protected String getFileNameExtension() {
        return FileFormatExtension.QWB.name().toLowerCase();
    }

    @Override
    protected void doHandle(String fileName) {
        System.out.println("Reading data from a QuickBooks file.");
    }
}
