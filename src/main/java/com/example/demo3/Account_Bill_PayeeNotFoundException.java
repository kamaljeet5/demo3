package com.example.demo3;


public class Account_Bill_PayeeNotFoundException extends Exception {
    private String account_bill_payeeId;

    public Account_Bill_PayeeNotFoundException(String account_bill_payeeId) {
        super(String.format("Account not found: %s", account_bill_payeeId));
    }
}

