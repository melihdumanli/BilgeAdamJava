package com.bilgeadam.marathon20211018;

import java.time.LocalDate;

public class Student extends Person {
    private LecturingClasses lecturingClass;
    private String phoneNumber3;
    private int bookDate;

    public Student(LecturingClasses lecturingClass, String registrationNumber, String name, String middleName, String surname, String gender, boolean isMarried, LocalDate birthDate, LocalDate startDate, LocalDate quitDate, String phoneNumber1, String phoneNumber2, String phoneNumber3) {
        super(registrationNumber, name, middleName, surname, gender, isMarried, birthDate, startDate, quitDate, phoneNumber1, phoneNumber2);
        this.lecturingClass = lecturingClass;
        this.phoneNumber3 = phoneNumber3;
    }

    @Override
    public String toString() {
        return "Öğrenci{" + super.toString() +
                "Aldığı Ders='" + lecturingClass + '\'' +
                ", Veli Telefon Numarası='" + phoneNumber3 + '\'' +
                "} ";
    }

    public LecturingClasses getLecturingClass() {
        return lecturingClass;
    }

    public String getPhoneNumber3() {
        return phoneNumber3;
    }
}
