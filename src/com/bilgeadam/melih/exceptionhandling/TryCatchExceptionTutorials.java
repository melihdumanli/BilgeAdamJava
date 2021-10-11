package com.bilgeadam.melih.exceptionhandling;

public class TryCatchExceptionTutorials {
    public static void sendMail(Exception e){
        System.out.println(e);
    }
    public static void main(String[] args) {
        // try catch throw finally

        // bir sayıyı sıfıra bölmek=tanımsız (sonsuz)
        try {
            int sayi = 3/0; // istisna
            System.out.println(sayi);
        }catch (Exception e) {
            sendMail(e);
            //e.printStackTrace();
        }


        System.out.println("Program devam ediyor...");
    }
}
