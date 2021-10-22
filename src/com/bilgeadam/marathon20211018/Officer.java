package com.bilgeadam.marathon20211018;

import java.time.LocalDate;

public class Officer extends Person{
    private Double salary;

    public Officer(String registrationNumber, String name, String middleName, String surname, String gender, boolean isMarried, LocalDate birthDate, LocalDate startDate, LocalDate quitDate, String phoneNumber1, String phoneNumber2, Double salary) {
        super(registrationNumber, name, middleName, surname, gender, isMarried, birthDate, startDate, quitDate, phoneNumber1, phoneNumber2);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Memur{" + super.toString() +
                "Maaş=" + salary + " TL"+
                "} " ;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
