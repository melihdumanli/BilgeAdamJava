package com.bilgeadam.melih.lesson22;

public class PersonName {
    private String firstName;
    private String middleName;
    private String lastName;

    public PersonName(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName ="";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    @Override
    public String toString() {
        return  "{firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
