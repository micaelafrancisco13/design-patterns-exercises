package com.example.fx;

public interface UndoableCommand extends Command {
    void unexecute();
}
