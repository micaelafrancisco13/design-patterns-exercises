package com.codewithmosh;

public class AESEncryptionAlgo implements EncryptionAlgo {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message " + message + " using AES");
    }
}