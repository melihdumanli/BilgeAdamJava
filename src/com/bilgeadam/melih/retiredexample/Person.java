package com.bilgeadam.melih.retiredexample;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Person implements Serializable {
    private static final long serialVersionUID = 5181131898962355811L;
    private long personId;
    private String name;
    private String surName;
    private String gender;
    private Date birthDate;
    private Date logsDate = new Date(System.currentTimeMillis());

    public Person() {
        this.personId = 0;
        this.name = "Ad Girilmedi";
        this.surName = "Soyad Girilmedi";
        this.gender = "Cinsiyet Belirtilmedi";
    }

    public Person(long personId, String name, String surName, String gender, Date birthDate) {
        this.personId = personId;
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.birthDate = birthDate;
    }


    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", logsDate=" + logsDate +
                '}';
    }

    public static List<Person> personInformation() {
        Scanner scanner = new Scanner(System.in);
        String name, surname, gender, stringToDate;
        Date birthDate;

        //eğer global yapıyı localde göstereceksem benden ilk başlangıç değerini ister.,
        List<Person> list = null;
        try {
            System.out.println("Lütfen Adınızı Giriniz:");
            name = scanner.nextLine();
            System.out.println("Lütfen Soyadınızı Giriniz");
            surname = scanner.nextLine();
            System.out.println("Lütfen Cinsiyetinizi Giriniz (Erkek/Kadın):");
            gender = scanner.nextLine();
            System.out.println("Lütfen Doğum Yılınızı Giriniz:");
            stringToDate = scanner.nextLine();

            //String olan yapıyı Date cast ettik
            birthDate = new SimpleDateFormat("yyyy").parse(stringToDate);

            Person person = new Person(1, name, surname, gender, birthDate);
            list = new ArrayList<Person>();
            list.add(person);

            //Stream().forEach
            list.stream().forEach(System.out::println);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void personRetirementAgeCalculate(List<Person> list) {
        List<Person> newList = list;
        Person person1 = list.get(0);
        String gender = person1.gender;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        //String bDate = dateFormat.format(person1.birthDate);
        int birthDate = Integer.parseInt(dateFormat.format(person1.birthDate));
        Date today = new Date(System.currentTimeMillis());
        int year = Integer.parseInt(dateFormat.format(today));
        if (gender.equalsIgnoreCase(Gender.Erkek.toString())) {
            int retirementDate = birthDate + 65 - year;
            System.err.println("Emekli Olmanıza Kalan Süre : " + retirementDate+ " Yıl");
        } else {
            int retirementDate = birthDate + 60 - year;
            System.err.println("Emekli Olmanıza Kalan Süre : " + retirementDate + " Yıl");
        }


    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getLogsDate() {
        return logsDate;
    }

    public void setLogsDate(Date logsDate) {
        this.logsDate = logsDate;
    }

    public static void main(String[] args) {
        personRetirementAgeCalculate(personInformation());
    }
}
