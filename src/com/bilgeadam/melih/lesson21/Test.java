package com.bilgeadam.melih.lesson21;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Araba","Volkswagen", 220.5 );
        System.out.println(vehicle);
        vehicle.setColor(Color.BLUE);
        System.out.println(vehicle + "\n");

        Vehicle vehicle1 = new Vehicle("Araba", "Volkswagen", 2200, Color.BLACK, 220.5, 0.0);
        System.out.println(vehicle1);
        System.out.println("Deneme %");

    }
}
