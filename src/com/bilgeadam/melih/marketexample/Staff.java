package com.bilgeadam.melih.marketexample;

public class Staff extends HumanBeings {
    protected double salary;
    protected String title;

    public Staff(long personalID, String firstName, String lastName, double salary) {
        super(personalID, firstName, lastName);
        this.salary = salary;
        this.title = "";
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    public double getCurrentAccount() {
        return 0;
    }
}
