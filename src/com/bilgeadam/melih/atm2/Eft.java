package com.bilgeadam.melih.atm2;

import java.util.Date;

public class Eft extends CommonProperty{
    // özellikler
    private String eftName;
    private String eftAmount;

    //parametresiz constructor
    public Eft() {
    }

    //parametreli constructor
    public Eft(String id, String eftName, String eftAmount) {
        super(id);
        this.eftName = eftName;
        this.eftAmount = eftAmount;
    }

    // toString
    @Override
    public String toString() {
        return "Eft{" +
                "id='" + getId() + '\'' +
                "eftName='" + eftName + '\'' +
                ", eftAmount='" + eftAmount + '\'' +
                ", date=" + getDate() +
                '}';
    }

    //getter and setter

    public String getEftName() {
        return eftName;
    }

    public void setEftName(String eftName) {
        this.eftName = eftName;
    }

    public String getEftAmount() {
        return eftAmount;
    }

    public void setEftAmount(String eftAmount) {
        this.eftAmount = eftAmount;
    }
}
