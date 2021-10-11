package com.bilgeadam.melih.atm2;

public enum MoneyCurrency {
    TL(1, "tl"), EUR(2,"eur"), USD(3, "usd"), CHF(4,"chf"), WON(5,"won");

    private final int number;
    private final String curr;

    MoneyCurrency(int number, String curr) {
        this.number = number;
        this.curr = curr;
    }

    public int getNumber() {
        return number;
    }

    public String getCurr() {
        return curr;
    }
}
