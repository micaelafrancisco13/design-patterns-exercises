package com.example;

import com.example.fx.CommandManager;

public class Main {
    public static void main(String[] args) {
        var document = new RichTextEditor.Document(
                "Title", "Content", "Body");

        var commandManager = new CommandManager();
        var richTextEditor = new RichTextEditor(document);

        commandManager.executeCommand(new BoldCommand(richTextEditor, DocumentProperty.TITLE));
        commandManager.executeCommand(new BoldCommand(richTextEditor, DocumentProperty.CONTENT));
        commandManager.executeCommand(new BoldCommand(richTextEditor, DocumentProperty.BODY));

        System.out.println("After bolding: " + richTextEditor.getDocument());

        commandManager.undoLastCommand();
        commandManager.undoLastCommand();

        System.out.println("After unbolding: " + richTextEditor.getDocument());
    }
}