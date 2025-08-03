package com.tycrek;

import io.ttrms.crypt.TittyCryptoException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws TittyCryptoException {
        System.out.println("init");
        System.out.println(Arrays.toString(TitCrypt.getAvailableEncryptAlgos()));
        TitCrypt.sampleCryptTest();
    }
}