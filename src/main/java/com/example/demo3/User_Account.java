package com.example.demo3;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;

@Entity
@Table(name="user_account", schema = "abcbanking")
public class User_Account {
    @Id
    private String user_accountId;

    private String user_accountName;

    public User_Account() {
        super();
    }

    public User_Account(String user_accountId, String user_accountName) {
        super();
        this.user_accountId = user_accountId;
        this.user_accountName = user_accountName;
    }

    public String getUser_accountId() {
        return user_accountId;
    }

    public void setUser_accountId(String user_accountId) {
        this.user_accountId = user_accountId;
    }

    public String getUser_accountName() {
        return user_accountName;
    }

    public void setUser_accountName(String user_accountName) {
        this.user_accountName = user_accountName;
    }
}
