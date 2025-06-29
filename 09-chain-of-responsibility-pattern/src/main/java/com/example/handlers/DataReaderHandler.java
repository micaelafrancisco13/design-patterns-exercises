package com.example.handlers;

public abstract class DataReaderHandler extends Handler {

    public DataReaderHandler(DataReaderHandler next) {
        super(next);
    }

    public void handle(String fileName) {
        if (fileName.endsWith(getFileNameExtension())) {
            doHandle(fileName);
            return;
        }

        if (next != null)
            next.handle(fileName);
    }

    protected abstract String getFileNameExtension();

    protected abstract void doHandle(String fileName);
}
