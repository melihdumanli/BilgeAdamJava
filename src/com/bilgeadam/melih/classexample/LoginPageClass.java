package com.bilgeadam.melih.classexample;

import java.util.Scanner;

public class LoginPageClass {
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LoginPageClass() {
        this.name = "adınızı girmediniz";
        this.surname = "soyadınızı girmediniz";
        this.email = "email girmediniz";
        this.phoneNumber = "telefon girmediniz";
    }

    public LoginPageClass(String name, String surname, String email, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    /*public static void loginPanel(){
        LoginPageClass loginPageClass = new LoginPageClass();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Adınızı Giriniz:");
        loginPageClass.setName(scanner.next());
        System.out.println("Lütfen Soyadınızı Giriniz: ");
        loginPageClass.setSurname(scanner.next());
        System.out.println("Lütfen e-Mail Adresinizi Giriniz:");
        loginPageClass.setEmail(scanner.next());
        System.out.println("Lütfen Telefon Numaranızı Giriniz: ");
        loginPageClass.setPhoneNumber(scanner.next());
        System.out.println("Yeni Kullanıcı Bilgileri : " + loginPageClass.getName() + " " + loginPageClass.getSurname() + " " + loginPageClass.getEmail() + " " + loginPageClass.getPhoneNumber());
    }*/
}
