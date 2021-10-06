package com.bilgeadam.melih.marketexample;

public class Customer extends HumanBeings{
    protected double debit;

    public Customer(long personalID, String firstName, String lastName) {
        super(personalID, firstName, lastName);
        this.debit = 0.0d;
    }

    public void finishShopping(double totalAmount){
        this.debit += totalAmount;
    }

    public void payyOfDebt (double amount){
        this.debit -= amount;
    }

    @Override
    public double getCurrentAccount() {
        return 0;
    }
}
