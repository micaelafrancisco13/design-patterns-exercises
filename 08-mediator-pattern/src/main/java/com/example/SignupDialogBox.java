package com.example;

public class SignupDialogBox {
    private final TextBox textBox = new TextBox();
    private final CheckBox checkBox = new CheckBox();
    private final Button button = new Button();
    private boolean noCredentials = true;

    SignupDialogBox() {
        textBox.addEventHandler(this::textBoxChanged);
        checkBox.addEventHandler(this::checkBoxChanged);
    }

    public void simulateUserInteraction() {
        textBox.setCredentials("John", "<PASSWORD>");
        checkBox.setChecked(true);
        System.out.println("Is button enabled? " + button.isEnabled());
    }

    private void textBoxChanged() {
        var username = textBox.getUsername();
        var password = textBox.getPassword();
        noCredentials = (password == null || username == null) || (password.isEmpty() || username.isEmpty());
    }

    private void checkBoxChanged() {
        button.setEnabled(!noCredentials && checkBox.isChecked());
    }
}
