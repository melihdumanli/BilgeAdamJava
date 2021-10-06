package com.bilgeadam.melih.lesson22;

public class Test {
    public static void main(String[] args) {
        Student person1 = new Student(54321, Gender.MALE, "Melih", "Dumanlı");
        System.out.println(person1);
        person1.setAge(32);
        person1.setPersonMiddleName("Middle");
        System.out.println(person1);
        System.out.println(person1.getName().getFirstName());
        System.out.println(person1.getName().getFullName());
    }
}
