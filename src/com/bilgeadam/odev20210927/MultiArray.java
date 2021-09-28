package com.bilgeadam.odev20210927;

import java.util.Random;
import java.util.Scanner;

public class MultiArray {
    public static int[][] multiArrayCreator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Satır Sayısını Giriniz: ");
        int row = scanner.nextInt();
        System.out.println("Lütfen Sütun Sayısını Giriniz :");
        int col = scanner.nextInt();
        while (row != col) {
            System.out.println("Lütfen Sütun Sayısını Satır Sayısı İle Aynı Değerde Giriniz: ");
            col = scanner.nextInt();
        }
        System.out.println("Lütfen Bir Simge Giriniz :");
        String symbol = scanner.next();
        System.out.println("Girmiş değerlerle aşağıdaki gibi bir matris oluşturulacaktır: ");
        int[][] multiArray = new int[row][col];
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println(symbol + " ");
        }
        int maxNumber = randomCreator();
        int midNumber = (maxNumber + 1) / 2;
        int minNumber = 1;
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                if (i == j)
                    multiArray[i][j] = midNumber;
                else if (i < j)
                    multiArray[i][j] = maxNumber;
                else
                    multiArray[i][j] = minNumber;
            }
        }

        System.out.println("Girmiş Değerlerle Oluşturulmuş Olan Dizi Aşağıdaki Gibidir :");
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
        return multiArray;
    }

    public static int randomCreator() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Lütfen Bir Üst Değer Giriniz :");
        int topNum = scanner.nextInt();
        int newRandom;
        do {
            newRandom = random.nextInt(topNum);
        } while ((newRandom % 2) == 0);
        System.out.println(newRandom);
        return newRandom;

    }
}
