package com.codewithmosh;

public class CustomWindow2 extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("Custom window 2 before close");
    }

    @Override
    protected void afterClose() {
        System.out.println("Custom window 2 after close");
    }
}
