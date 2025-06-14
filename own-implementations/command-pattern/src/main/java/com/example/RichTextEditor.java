package com.example;

import lombok.*;

@AllArgsConstructor
@Getter
public class RichTextEditor {
    private final Document document;

    public void makeBold(DocumentProperty documentProperty) {
        var property = documentProperty.toString();
        try {
            BeanUtils.setProperty(document,
                    property,
                    "<b>" + BeanUtils.getProperty(document, property) + "</b>");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void undoMakeBold(Document originalDocument) {
        document.setTitle(originalDocument.getTitle());
        document.setContent(originalDocument.getContent());
        document.setBody(originalDocument.getBody());
    }

    @AllArgsConstructor
    @Getter
    @Setter
    @ToString
    public static class Document {
        private String title;
        private String content;
        private String body;
    }
}
