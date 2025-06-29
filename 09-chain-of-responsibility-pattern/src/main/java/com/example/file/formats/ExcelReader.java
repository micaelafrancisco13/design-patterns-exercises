package com.example.file.formats;

import com.example.handlers.DataReaderHandler;

public class ExcelReader extends DataReaderHandler {
    public ExcelReader(DataReaderHandler next) {
        super(next);
    }

    @Override
    protected String getFileNameExtension() {
        return FileFormatExtension.XLS.name().toLowerCase();
    }

    @Override
    protected void doHandle(String fileName) {
        System.out.println("Reading data from an Excel spreadsheet.");
    }
}
