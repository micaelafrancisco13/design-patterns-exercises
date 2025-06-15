package com.example;

import com.example.fx.CommandManager;

public class Main {
    public static void main(String[] args) {

        var commandManager = new CommandManager();
        var videoEditor = new VideoEditor();

        commandManager.executeCommand(new ModifyContrastCommand(videoEditor, 1f));
        commandManager.executeCommand(new ModifyContrastCommand(videoEditor, 1.5f));
        commandManager.executeCommand(new ModifyContrastCommand(videoEditor, 2.0f));
        System.out.println(videoEditor.getContrast());

        commandManager.undoLastCommand();
        commandManager.undoLastCommand();
        System.out.println(videoEditor.getContrast());

        commandManager.executeCommand(new SetTextCommand(videoEditor, "Hello World!"));
        System.out.println(videoEditor.getText());

        commandManager.undoLastCommand();
        System.out.println(videoEditor.getText());
    }
}