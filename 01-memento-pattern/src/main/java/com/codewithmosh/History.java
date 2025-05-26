package com.codewithmosh;

import lombok.Getter;

import java.util.Stack;

@Getter
public class History {
    private final Stack<AppDocumentState> states = new Stack<>();

    public void push(AppDocumentState state) {
        states.push(state);
    }

    public AppDocumentState pop() {
        return states.pop();
    }
}
