package com.example.demo3;

public class Bill_PayeeNotFoundException extends Exception {
    private String bill_payeeId;

    public Bill_PayeeNotFoundException(String bill_payeeId) {
        super(String.format("Account not found: %s", bill_payeeId));
    }
}

