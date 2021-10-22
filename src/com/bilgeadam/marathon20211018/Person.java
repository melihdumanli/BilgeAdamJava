package com.bilgeadam.marathon20211018;

import java.time.LocalDate;
import java.util.Date;

public abstract class Person {
    private String registrationNumber;
    private String name;
    private String middleName;
    private String surname;
    private String gender;
    private boolean isMarried;
    private LocalDate birthDate;
    private LocalDate startDate;
    private LocalDate quitDate;
    private String phoneNumber1;
    private String phoneNumber2;

    public Person(String registrationNumber, String name, String middleName, String surname, String gender, boolean isMarried, LocalDate birthDate, LocalDate startDate, LocalDate quitDate, String phoneNumber1, String phoneNumber2) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.gender = gender;
        this.isMarried = isMarried;
        this.birthDate = birthDate;
        this.startDate = startDate;
        this.quitDate = quitDate;
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
    }

    @Override
    public String toString() {
        return "Sicil Numarası='" + registrationNumber + '\'' +
                ", Adı='" + name + '\'' +
                ", Göbek Adı='" + middleName + '\'' +
                ", Soyadı='" + surname + '\'' +
                ", Evlilik Durumu=" + isMarried +
                ", Doğum Tarihi=" + birthDate +
                ", İşe Başlama Tarihi=" + startDate +
                ", İşten Çıkış Tarihi=" + quitDate +
                ", Cep Telefonu='" + phoneNumber1 + '\'' +
                ", Ev Telefonu='" + phoneNumber2 + '\'' +
                '}';
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getQuitDate() {
        return quitDate;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }
}
