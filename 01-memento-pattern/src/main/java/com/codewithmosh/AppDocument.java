package com.codewithmosh;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AppDocument {
    private String content;
    private String fontName;
    private String fontSize;

    public AppDocumentState save() {
        return new AppDocumentState(content, fontName, fontSize);
    }

    public void restore(AppDocumentState state) {
        content = state.getContent();
        fontName = state.getFontName();
        fontSize = state.getFontSize();
    }
}
