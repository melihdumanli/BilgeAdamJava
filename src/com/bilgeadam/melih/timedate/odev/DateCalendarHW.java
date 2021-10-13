package com.bilgeadam.melih.timedate.odev;

import java.util.Date;
import java.util.Scanner;

public class DateCalendarHW {
    public static void getResult(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Lütfen Pozitif, 1 ile 23 Arasında Bir Sayı Giriniz:");
            String simge = scanner.nextLine();
            char character = simge.charAt(0);

            if (Character.isDigit(character)) {
                if (1<=Integer.parseInt(simge) && Integer.parseInt(simge)<=23){
                    getClockGame(Integer.parseInt(simge));
                }else {
                    getResult();
                }
            }else if (Character.isLetter(character)){
                System.out.println("Bu bir Harftir.");
            } else
                System.out.println("Negatif Sayı");
            scanner.close();
        }

    }
    public static void getClockGame(int sayi){
        try {
            Date date = new Date();
            int hours = date.getHours();
            int count =0;
            int prediction =0;
            System.out.println(hours);

            Scanner scanner = new Scanner(System.in);

            while (count>0){
                System.out.println("Hakkınız: " + count);
                System.out.println("Tahmin Sayınız: " + prediction);
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

    }


}
