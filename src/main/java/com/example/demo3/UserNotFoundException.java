package com.example.demo3;

public class UserNotFoundException extends Exception {
    private String userId;

    public UserNotFoundException(String userId) {
        super(String.format("User not found: %s", userId));
    }
}
