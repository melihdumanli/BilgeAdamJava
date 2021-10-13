package com.bilgeadam.melih.exceptionhandling;

import java.io.IOException;

public class _4ThrowsTutorials {
    // mimarisini:
    // bu metottta meydana gelebilecek istisna durumlarını belirteyim sonrasında bu
    // metotu kullanan kişiler kullansın.

    // IOS Android C# Java Python
    public static void deneme() throws IOException, ArithmeticException, NullPointerException {
        int sayi = 0 / 3;
        System.out.println(sayi);
        System.out.println("Program devam ediyor 2222 ");
    }

    public static void main(String[] args) {
        try {
			deneme();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
