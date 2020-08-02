package com.example.demo3;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;

@Entity
@Table(name="bill_payee", schema = "abcbanking")
public class Bill_Payee {
    @Id
    private String bill_payeeId;

    private String bill_payeeName;

    public Bill_Payee() {
        super();
    }

    public Bill_Payee(String bill_payeeId, String bill_payeeName) {
        super();
        this.bill_payeeId = bill_payeeId;
        this.bill_payeeName = bill_payeeName;
    }

    public String getBill_payeeId() {
        return bill_payeeId;
    }

    public void setBill_payeeId(String bill_payeeId) {
        this.bill_payeeId = bill_payeeId;
    }

    public String getBill_payeeName() {
        return bill_payeeName;
    }

    public void setBill_payeeName(String bill_payeeName) {
        this.bill_payeeName = bill_payeeName;
    }
}