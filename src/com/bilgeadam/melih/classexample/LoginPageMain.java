package com.bilgeadam.melih.classexample;

public class LoginPageMain {
    public static void main(String[] args) {
        LoginPageClass class1 = new LoginPageClass("Melih", "Dumanlı", "555", "555");
        System.out.println(class1.getName() + class1.getSurname() + class1.getEmail() + class1.getEmail());
    }
}
