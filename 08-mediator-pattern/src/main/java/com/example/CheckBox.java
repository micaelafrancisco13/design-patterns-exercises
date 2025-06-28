package com.example;

import lombok.Getter;

@Getter
public class CheckBox extends UIControl {
    private boolean isChecked;

    public void setChecked(boolean isChecked) {
        this.isChecked = isChecked;
        notifyEventHandlers();
    }
}
