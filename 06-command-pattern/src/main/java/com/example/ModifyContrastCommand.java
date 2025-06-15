package com.example;

import com.example.fx.UndoableCommand;

public class ModifyContrastCommand implements UndoableCommand {
    private final VideoEditor videoEditor;
    private final float contrast;
    private float originalContrast;

    public ModifyContrastCommand(VideoEditor videoEditor, Float contrast) {
        this.videoEditor = videoEditor;
        this.contrast = contrast;
    }

    @Override
    public void unexecute() {
        videoEditor.setContrast(originalContrast);
    }

    @Override
    public void execute() {
        originalContrast = videoEditor.getContrast();
        videoEditor.setContrast(contrast * originalContrast);
    }
}
