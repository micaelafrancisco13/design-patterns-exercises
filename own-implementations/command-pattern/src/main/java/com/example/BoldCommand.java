package com.example;

import com.example.fx.UndoableCommand;

public class BoldCommand implements UndoableCommand {
    private final RichTextEditor richTextEditor;
    private final DocumentProperty documentProperty;
    private RichTextEditor.Document originalDocument;

    public BoldCommand(RichTextEditor richTextEditor, DocumentProperty documentProperty) {
        this.richTextEditor = richTextEditor;
        this.documentProperty = documentProperty;
    }

    @Override
    public void unexecute() {
        richTextEditor.undoMakeBold(originalDocument);
    }

    @Override
    public void execute() {
        saveOriginalDocument();
        richTextEditor.makeBold(documentProperty);
    }

    private void saveOriginalDocument() {
        originalDocument = new RichTextEditor.Document(
                richTextEditor.getDocument().getTitle(),
                richTextEditor.getDocument().getContent(),
                richTextEditor.getDocument().getBody()
        );
    }
}
