package com.bilgeadam.melih.classexample;

public class ClassTutorials {
    private static String telephoneTrade;
    private double telephonePrice;
    private String telephoneColor;
    private boolean isProduction;
    private int yearOfProduction;

    public static String getTelephoneTrade() {
        return telephoneTrade;
    }

    public static void setTelephoneTrade(String telephoneTrade) {
        ClassTutorials.telephoneTrade = telephoneTrade;
    }

    public double getTelephonePrice() {
        return telephonePrice;
    }

    public void setTelephonePrice(double telephonePrice) {
        this.telephonePrice = telephonePrice;
    }

    public String getTelephoneColor() {
        return telephoneColor;
    }

    public void setTelephoneColor(String telephoneColor) {
        this.telephoneColor = telephoneColor;
    }

    public boolean isProduction() {
        return isProduction;
    }

    public void setProduction(boolean production) {
        isProduction = production;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}
