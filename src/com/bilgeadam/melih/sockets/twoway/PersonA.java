package com.bilgeadam.melih.sockets.twoway;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PersonA {
    private int id;
    private String firstName;
    private String lastName;
    private String logDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

    public PersonA() {
        // TODO Auto-generated constructor stub
    }

    public PersonA(int id, String firstName, String lastName) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "_Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogDate() {
        return logDate;
    }

    public void setLogDate(String logDate) {
        this.logDate = logDate;
    }

}
