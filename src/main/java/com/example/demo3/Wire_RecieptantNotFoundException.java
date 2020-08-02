package com.example.demo3;

public class Wire_RecieptantNotFoundException extends Exception {
    private String wire_Id;

    public Wire_RecieptantNotFoundException(String wire_Id) {
        super(String.format("Account not found: %s", wire_Id));
    }
}
