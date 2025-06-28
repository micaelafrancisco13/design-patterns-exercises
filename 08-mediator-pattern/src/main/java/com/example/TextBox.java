package com.example;

import lombok.Getter;

@Getter
public class TextBox extends UIControl {
    private String username;
    private String password;

    public void setCredentials(String username, String password) {
        this.username = username;
        this.password = password;
        notifyEventHandlers();
    }
}
