package com.bilgeadam.melih.retiredexample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ExampleMain {

    public Person getPersonInfo() throws ParseException {

        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Kullanıcı ID'nizi Giriniz:");
        person.setPersonId(scanner.nextInt());
        System.out.println("Lütfen Adınızı Giriniz:");
        person.setName(scanner.next());
        System.out.println("Lütfen Soyadınızı Giriniz");
        person.setSurName(scanner.next());
        System.out.println("Lütfen Doğum Tarihinizi GG-AA-YYYY formatında giriniz:");
        //person.setBirthDate(scanner.next());
        //Date date = new SimpleDateFormat("dd-MM-YYYY").parse(person.getBirthDate());
        return person;
    }
}
