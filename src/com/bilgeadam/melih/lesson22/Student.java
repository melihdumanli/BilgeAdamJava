package com.bilgeadam.melih.lesson22;

public class Student extends Person{
    String[] courses;
    private int numOfCourses;

    public Student(long identitiyNumber, Gender gender, String firsName, String lastName) {
        super(identitiyNumber, gender, firsName, lastName);
        this.courses = new String[10];
        this.numOfCourses = 0;
    }


}
