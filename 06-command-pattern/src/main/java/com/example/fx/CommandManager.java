package com.example.fx;

import java.util.Stack;

public class CommandManager {
    private final Stack<UndoableCommand> history = new Stack<>();

    public void executeCommand(UndoableCommand command) {
        command.execute();
        history.push(command);
    }

    public void undoLastCommand() {
        if (!history.isEmpty()) {
            var lastCommand = history.pop();
            lastCommand.unexecute();
        }
    }
}
