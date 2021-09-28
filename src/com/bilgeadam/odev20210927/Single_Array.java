package com.bilgeadam.odev20210927;

import java.util.Scanner;
import java.util.Random;

public class Single_Array {
    public static int numberOfElements() {
        System.out.println("Lütfen Dizinin Eleman Sayısını Giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }

    public static int topNumber() {
        System.out.println("Lütfen Dizinin Üst Sınır Sayısını Giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int topNum = scanner.nextInt();
        return topNum;
    }

    public static int[] randomCalculator() {
        int num = numberOfElements();
        int topNum = topNumber();
        int[] newArray = new int[num];
        Random randomClass = new Random();
        for (int j = 0; j < num; j++) {
            newArray[j] = randomClass.nextInt(topNum) + 1;
        }
        return newArray;
    }

    public static void result() {
        int[] newArray = randomCalculator();
        int evenNumber = 0, oddNumber = 0, sum = 0, j = 0, x = 0;
        int[] evenArray = new int[newArray.length];
        int[] oddArray = new int[newArray.length];
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
            sum = sum + newArray[i];
            if (newArray[i] % 2 == 0) {
                evenNumber++;
                evenArray[j] = newArray[i];
                j++;
            } else {
                oddNumber++;
                oddArray[x] = newArray[i];
                x++;
            }
        }
        boolean prime = false;
        int counter = 0;
        for (int i = 0; i < newArray.length; i++) {
            for (int k = 2; k < newArray.length; k++) {
                if (newArray[i] % k == 0) {
                    counter++;
                }
            }
        }

        int minValue = 0;
        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i - 1] <= newArray[i])
                minValue = newArray[i - 1];
            else
                minValue = newArray[i];
        }

        int fact = 1;
        for (int i = 1; i <= minValue; i++) {
            fact = fact * i;
        }

        System.out.println("\n Dizideki elementlerin toplamı = " + sum);
        System.out.println("Dizideki elementlerin ortalaması = " + (sum / newArray.length));
        System.out.println("Dizideki çift sayıların sayısı : " + evenNumber);
        System.out.println("Dizideki tek sayıların sayısı : " + oddNumber);
        System.out.println("Dizinin ilk elemanı : " + newArray[0]);
        System.out.println("Dizinin son elemanı : " + newArray[newArray.length - 1]);
        System.out.println("Çift Sayıların Dizisi :");
        for (int i = 0; i < evenNumber; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println("");
        System.out.println("Tek Sayıların Dizisi :");
        for (int i = 0; i < oddNumber; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println("\nDizideki asal sayıların sayısı : " + counter);
        System.out.println("Dizinin en küçük elemanı : " + minValue);
        System.out.println("Dizinin en küçük elemanının faktöriyeli : " + fact);
    }
}