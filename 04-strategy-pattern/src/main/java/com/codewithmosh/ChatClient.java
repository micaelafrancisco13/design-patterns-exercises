package com.codewithmosh;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ChatClient {
    private final EncryptionAlgo encryptionAlgo;

    public void send(String message) {
        encryptionAlgo.encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}

