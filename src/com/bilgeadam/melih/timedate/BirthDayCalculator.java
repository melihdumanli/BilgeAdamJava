package com.bilgeadam.melih.timedate;

import com.bilgeadam.BAUtils.BAUtils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthDayCalculator {

    public static void main(String[] args) {
        BAUtils.header("Doğum Günü Hesaplama Programına Hoşgeldiniz");
        Scanner scanner = new Scanner(System.in);
        int birthYear, birthMonth, birthDay;
        System.out.println("Lütfen Doğum Yılınızı Giriniz:");
        birthYear = scanner.nextInt();
        System.out.println("Lütfen Doğduğunuz Ayı Sayı Olarak Giriniz:");
        birthMonth = scanner.nextInt();
        System.out.println("Lütfen Doğduğunuz Günü Giriniz:");
        birthDay = scanner.nextInt();

        LocalDate birthDate = LocalDate.of(birthYear,birthMonth,birthDay);
        System.out.println(birthDate);
        long daysToToday = birthDate.until(LocalDate.now(), ChronoUnit.DAYS);
        long monthsToThisMonth = birthDate.until(LocalDate.now(), ChronoUnit.MONTHS);
        long yearsToThisYear = birthDate.until(LocalDate.now(), ChronoUnit.YEARS);
        System.out.println(daysToToday);
        System.out.println(monthsToThisMonth);
        System.out.println(yearsToThisYear);
    }
}
