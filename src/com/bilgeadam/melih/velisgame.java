package com.bilgeadam.melih;

import java.util.Scanner;

import com.bilgeadam.BAUtils.BAUtils;

public class velisgame {
    public static void main(String[] args) {

        BAUtils.header("WELCOME TO HELL");
        boolean[] spints = new boolean[1000];
        for (int i=0; i< spints.length; i++) {
            spints[i] = false;
        }

        for (int tour =1; tour<= spints.length; tour++) {
            for (int i=0; i< spints.length;) {
                spints[i] = !spints[i];
                i = i + tour;
            }
        }
        int count = 0;
        for (int i=0; i< spints.length;i++){
            if (spints[i]) {
                System.out.println(i + " ");
                count++;
            }
        }
        System.out.println("\n" + count);

    }
}
