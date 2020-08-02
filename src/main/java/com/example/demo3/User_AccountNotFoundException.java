package com.example.demo3;

public class User_AccountNotFoundException extends Exception {
    private String user_accountId;

    public User_AccountNotFoundException(String user_accountId) {
        super(String.format("User not found: %s", user_accountId));
    }
}

