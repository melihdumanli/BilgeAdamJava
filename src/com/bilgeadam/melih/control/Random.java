package com.bilgeadam.melih.control;

public class Random {
    public static void main(String[] args) {

        // Math Random
        double random = Math.floor(Math.random()*5+1);
        System.out.println(random);

        //Class Random
        // java.util
        java.util.Random randomClass = new java.util.Random();
        int random2 = randomClass.nextInt(9) +1;
        System.out.println(random2);
    }
}
