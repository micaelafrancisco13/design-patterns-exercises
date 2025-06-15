package com.example;

import com.example.fx.UndoableCommand;

public class SetTextCommand implements UndoableCommand {
    private final VideoEditor videoEditor;
    private final String text;

    public SetTextCommand(VideoEditor videoEditor, String text) {
        this.videoEditor = videoEditor;
        this.text = text;
    }

    @Override
    public void unexecute() {
        videoEditor.removeText();
    }

    @Override
    public void execute() {
        videoEditor.setText(text);
    }
}
