package com.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class VideoEditor {
    private float contrast = 0.5f;
    private String text;

    public void removeText() {
        text = "";
    }
}
