package com.example.demo3;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;

@Entity
@Table(name="account_transaction", schema = "abcbanking")
public class Account_Transaction {
    @Id
    private String january;

    private String feb;

    public Account_Transaction() {
        super();
    }

    public Account_Transaction(String january, String feb) {
        super();
        this.january = january;
        this.feb = feb;
    }

    public String getJanuary() {
        return january;
    }

    public void setJanuary(String january) {
        this.january = january;
    }

    public String getFeb() {
        return feb;
    }

    public void setFeb(String feb) {
        this.feb = feb;
    }
}