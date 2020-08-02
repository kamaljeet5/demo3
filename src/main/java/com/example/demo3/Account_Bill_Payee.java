package com.example.demo3;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;

@Entity
@Table(name="account_bill_payee", schema = "abcbanking")
public class Account_Bill_Payee {
    @Id
    private String account_bill_payeeId;


    public Account_Bill_Payee() {
        super();
    }

    public Account_Bill_Payee(String account_bill_payeeId) {
        super();
        this.account_bill_payeeId = account_bill_payeeId;
    }

    public String getAccount_Bill_PayeeId() {
        return account_bill_payeeId;
    }

    public void setAccount_Bill_PayeeId(String account_bill_payeeId) {
        this.account_bill_payeeId = account_bill_payeeId;
    }

}