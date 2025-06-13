package com.codewithmosh;

public abstract class Window {
    protected abstract void beforeClose();

    protected abstract void afterClose();

    public final void close() {
        beforeClose();
        System.out.println("Removing the window from the screen...");
        afterClose();
    }
}
