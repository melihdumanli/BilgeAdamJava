package com.bilgeadam.melih.control;

import java.util.Scanner;

public class OrtancaSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tek sayı giriniz : ");
        int number = scanner.nextInt();
        while (number%2==0) {
            System.out.println("Çift Sayı Girdiniz. Lütfen Tek Sayı Giriniz.");
            number = scanner.nextInt();
        }
        int[] newArray = new int[number];
        for (int i = 0; i < number; i++) {
            newArray[i] = i+1;
        }
        int midNumber = (newArray[0] + newArray[number-1])/2;
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println("Ortanca Sayı : " + midNumber);

    }

}
