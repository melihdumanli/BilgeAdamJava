package com.bilgeadam.melih.realty;

import java.io.Serial;
import java.io.Serializable;

public class Adress implements Serializable {
    @Serial
    private static final long serialVersionUID = 3260421564664524389L;
    private String street;
    private String city;
    private String country;
    private int number;

    public Adress(String street, String city, String country, int number) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", Country='" + country + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
