package com.codewithmosh;

public class CustomWindow1 extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("Custom window 1 before close");
    }

    @Override
    protected void afterClose() {
        System.out.println("Custom window 1 after close");
    }
}
