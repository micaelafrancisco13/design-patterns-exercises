package com.codewithmosh;

public class DESEncryptionAlgo implements EncryptionAlgo {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message " + message + " using DES");
    }
}
