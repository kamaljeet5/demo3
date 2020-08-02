package com.example.demo3;


public class Account_TransactionNotFoundException extends Exception {
    private String january;

    public Account_TransactionNotFoundException(String january) {
        super(String.format("Account not found: %s", january));
    }
}
