package com.codewithmosh;

public class Main {
    public static void main(String[] args) {
        var chatClient1 = new ChatClient(new AESEncryptionAlgo());
        chatClient1.send("Hello World!");

        var chatClient2 = new ChatClient(new DESEncryptionAlgo());
        chatClient2.send("Hello Ela!");
    }
}