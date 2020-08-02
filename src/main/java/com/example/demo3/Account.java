package com.example.demo3;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;

@Entity
@Table(name="account", schema = "abcbanking")
public class Account {
    @Id
    private String accountId;

    private String accountName;

    public Account() {
        super();
    }

    public Account(String accountId, String accountName) {
        super();
        this.accountId = accountId;
        this.accountName = accountName;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}