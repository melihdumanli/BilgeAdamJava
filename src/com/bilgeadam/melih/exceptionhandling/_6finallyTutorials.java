package com.bilgeadam.melih.exceptionhandling;

import java.util.Scanner;

// try catch throw throws finally
public class _6finallyTutorials {
    public static void main(String[] args) {

        try {
            int a = 3/0;
            System.out.println("kapatılacak: db.close();");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("kapatılacak: db.close();");

        }
    }
}
