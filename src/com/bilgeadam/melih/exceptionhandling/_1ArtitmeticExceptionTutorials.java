package com.bilgeadam.melih.exceptionhandling;

public class _1ArtitmeticExceptionTutorials {
    public static void sendMail(Exception e){
        System.out.println("Mail " + _1ArtitmeticExceptionTutorials.class + e);
    }
    public static void main(String[] args) {
        // try catch throw finally

        // bir sayıyı sıfıra bölmek=tanımsız (sonsuz)
        try {
            int sayi = 3/0; // istisna
            System.out.println(sayi);
        }catch (ArithmeticException ai) {
            sendMail(ai);
            //e.printStackTrace();
        }catch (Exception e) {
            sendMail(e);
            //e.printStackTrace();
        }


        System.out.println("Program devam ediyor...");
    }
}
