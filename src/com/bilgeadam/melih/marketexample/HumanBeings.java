package com.bilgeadam.melih.marketexample;

import java.util.Date;

public abstract class HumanBeings {
    protected long personalID;
    protected String firstName;
    protected String lastName;
    protected Date birthDate;
    protected String adress;
    protected long[] telephone;
    protected int telIndex;


    public HumanBeings() {
    }

    public HumanBeings(long personalID, String firstName, String lastName) {
        super();
        this.personalID = personalID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = new long[3];
        this.birthDate = null;
        this.adress = "";
        this.telIndex = 0;
    }
    public abstract double getCurrentAccount();

    public boolean addTelephoneNumber(long number){
        if(telIndex<3){
        this.telephone[telIndex] = number;
        telIndex++;
        return true;
        }
        return false;
    }

}
