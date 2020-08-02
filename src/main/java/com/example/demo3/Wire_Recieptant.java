package com.example.demo3;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;

@Entity
@Table(name="wire_recieptant", schema = "abcbanking")
public class Wire_Recieptant {
    @Id
    private String wire_Id;

    private String wire_Name;

    public Wire_Recieptant() {
        super();
    }

    public Wire_Recieptant(String wire_Id, String wire_Name) {
        super();
        this.wire_Id = wire_Id;
        this.wire_Name = wire_Name;
    }

    public String getWire_Id() {
        return wire_Id;
    }

    public void setWire_Id(String wire_Id) {
        this.wire_Id = wire_Id;
    }

    public String getWire_Name() {
        return wire_Name;
    }

    public void setWire_Name(String wire_Name) {
        this.wire_Name = wire_Name;
    }
}