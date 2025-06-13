package com.codewithmosh;

public class Main {
    public static void main(String[] args) {
        var history = new History();

        var appDocument = new AppDocument();
        appDocument.setContent("Hello World");
        appDocument.setFontName("Arial");
        appDocument.setFontSize("12");
        history.push(appDocument.save());

        appDocument.setContent("Hello Ela");
        appDocument.setFontName("Times New Roman");
        appDocument.setFontSize("13");
        history.push(appDocument.save());

        appDocument.setContent("Hello Mosh");
        appDocument.setFontName("Courier New");
        appDocument.setFontSize("14");
        // Right before saving the current state, we changed our minds and decided
        // to perform an undo operation at line 30.

        for (var state : history.getStates()) {
            System.out.println(state);
        }

        appDocument.restore(history.pop());
        System.out.println("After restoring: " + appDocument);
    }
}