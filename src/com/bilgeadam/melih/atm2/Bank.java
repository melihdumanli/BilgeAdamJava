package com.bilgeadam.melih.atm2;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    //özellikler
    protected String bankName;
    protected String bankCity;
    protected String bankLogo;

    protected List<Eft> bankEftSerial;
    protected List<Havale> bankHavaleSerial;

    //composition
    protected List<MoneyWallet> moneyList;

    // parametresiz constructor
    public Bank() {
        bankHavaleSerial = new ArrayList<Havale>();
        bankHavaleSerial.add(new Havale("1", "Havale 1 Seri140", "5000"));
        bankHavaleSerial.add(new Havale("2", "Havale 2 Seri150", "6000"));
        bankHavaleSerial.add(new Havale("3", "Havale 3 Seri160", "7000"));
        bankHavaleSerial.add(new Havale("4", "Havale 4 Seri170", "8000"));

        bankEftSerial = new ArrayList<Eft>();
        bankEftSerial.add(new Eft("1", "Eft 1 Seri141", "2000"));
        bankEftSerial.add(new Eft("2", "Eft 2 Seri142", "3000"));
        bankEftSerial.add(new Eft("3", "Eft 3 Seri143", "4000"));
        bankEftSerial.add(new Eft("4", "Eft 4 Seri144", "5000"));
    }
    //parametreli constructor
    public Bank(String bankName, String bankCity, String bankLogo) {
        this.bankName = bankName;
        this.bankCity = bankCity;
        this.bankLogo = bankLogo;
    }

    //toString

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", bankCity='" + bankCity + '\'' +
                ", bankLogo='" + bankLogo + '\'' +
                '}';
    }

    //method

    //getter and setter
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getBankLogo() {
        return bankLogo;
    }

    public void setBankLogo(String bankLogo) {
        this.bankLogo = bankLogo;
    }
}
