package com.bilgeadam.melih.atm2;

public class Havale extends CommonProperty{
    // özellikler
    private String havaleName;
    private String havaleAmount;

    //parametresiz constructor
    public Havale() {
    }

    //parametreli constructor
    public Havale(String id, String havaleName, String havaleAmount) {
        super(id);
        this.havaleName = havaleName;
        this.havaleAmount = havaleAmount;
    }

    // toString
    @Override
    public String toString() {
        return "Eft{" +
                "id='" + getId() + '\'' +
                "eftName='" + havaleName + '\'' +
                ", eftAmount='" + havaleAmount + '\'' +
                ", date=" + getDate() +
                '}';
    }

    //getter and setter

    public String getHavaleName() {
        return havaleName;
    }

    public void setHavaleName(String havaleName) {
        this.havaleName = havaleName;
    }

    public String getHavaleAmount() {
        return havaleAmount;
    }

    public void setHavaleAmount(String havaleAmount) {
        this.havaleAmount = havaleAmount;
    }
}
