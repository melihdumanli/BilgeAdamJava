package com.bilgeadam.melih.sockets.hw20211020;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String surname;
    private String password;
    private int id;

    public Person(String name, String surname, String password, int id) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Adı='" + name + '\'' +
                ", Soyadı='" + surname + '\'' +
                ", ID=" + id +
                '}';
    }
}
