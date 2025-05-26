package com.codewithmosh;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class AppDocumentState {
    private String content;
    private String fontName;
    private String fontSize;
}
