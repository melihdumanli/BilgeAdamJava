package com.bilgeadam.melih.exceptionhandling;

public class _3AllExceptionsRevise {
    public static void deneme() {
        int[] dizi = new int[5];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = i;
        }
        //forEach
        for (int temp : dizi) {
            System.out.println(dizi[temp]);
        }
        try {
            System.out.println(dizi[5]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program Devam Ediyor...");

    }

    public static void main(String[] args) {
        deneme();
    }

}
