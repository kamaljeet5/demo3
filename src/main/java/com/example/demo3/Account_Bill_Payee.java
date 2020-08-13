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

    private String account_bill_payeeName;

    public Account_Bill_Payee() {
        super();
    }

    public Account_Bill_Payee(String account_bill_payeeId, String account_bill_payeeName) {
        super();
        this.account_bill_payeeId = account_bill_payeeId;
        this.account_bill_payeeName = account_bill_payeeName;
    }

    public String getAccount_Bill_PayeeId() {
        return account_bill_payeeId;
    }

    public void setAccount_Bill_PayeeId(String account_bill_payeeId) {
        this.account_bill_payeeId = account_bill_payeeId;
    }
    public String getAccount_bill_payeeName() {
        return account_bill_payeeName;
    }
    public void setAccount_bill_payeeName(String account_bill_payeeName) {
        this.account_bill_payeeName = account_bill_payeeName;
    }
}