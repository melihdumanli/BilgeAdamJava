package com.bilgeadam.melih.timedate.odev;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateCalenderTutorials {
    private static int counter =1;

    public static void getFindDate(){
        try {
            Date date = new Date();

            switch (date.getMonth() + 1) {
                case 1 -> System.out.println("Ocak");
                case 2 -> System.out.println("Şubat");
                case 3 -> System.out.println("Mart");
                case 4 -> System.out.println("Nisan");
                case 5 -> System.out.println("Mayıs");
                case 6 -> System.out.println("Haziran");
                case 7 -> System.out.println("Temmuz");
                case 8 -> System.out.println("Ağustos");
                case 9 -> System.out.println("Eylül");
                case 10 -> System.out.println("Ekim");
                case 11 -> System.out.println("Kasım");
                case 12 -> System.out.println("Aralık");
                default -> System.out.println("Sayı Yok");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void getPatternDate(){
        Locale locale = new Locale("tr","TR");
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY MMMM dd HH:mm:ss zzzz", locale);
        Date date = new Date();
        String str = dateFormat.format(locale);
        System.out.println(str);
        System.out.println(date);

        /*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY MMMM dd");
        LocalDate localDate = LocalDate.now();
        localDate.format(formatter);
        System.out.println(localDate);
        System.out.println();*/
    }

    public static void getTime(){

        try {
            Scanner scanner = new Scanner(System.in);
            Date date = new Date();
            int dateHours = date.getHours();
            int i=1, j = 0;
            String s;
            boolean flag=true;
            System.out.println("Lütfen Saati Tamin Ediniz:");

            do {
                s = scanner.nextLine();
                if (s==null || s.equals("")) {
                    System.err.println("Geçersiz Bir Değer Girdiniz. Lütfen Tekrar Deneyiniz:");
                    flag = false;
                } else {
                    for (int k = 0; k < s.length(); k++) {
                        if (!Character.isDigit(s.charAt(k))) {
                                flag = false;
                        }
                    }
                    j = Integer.parseInt(s);
                    if (j < 0) {
                        System.out.println("Lütfen Pozitif Bir Sayı Giriniz:");
                        flag = false;
                    }
                    else {

                            if (j==dateHours) {
                                System.out.println("Tebrikler. " + i + ". Denemede Bildiniz.");

                                flag = true;
                                break;
                            }
                            else if (j<dateHours && (dateHours-j)>2 && i<15)
                                System.out.println("Biraz arttır");
                            else if (j<dateHours && (dateHours-j)<=2 && i<15)
                                System.out.println("Çok Yaklaştın. Biraz daha arttır");
                            else if (j>dateHours && (j-dateHours)>2 && i<15)
                                System.out.println("Biraz azalt");
                            else if (j>dateHours && (j-dateHours)<=2 && i<15)
                                System.out.println("Çok Yaklaştın. Biraz daha azalt");
                            else
                                System.out.println("Bye Bye");
                            i++;

                        }
                    }

            } while (flag == false || i<=15);
        }catch (NumberFormatException e){
            System.err.println("Geçersiz Bir Değer Girdiniz.");;
        }finally {
            boolean request = wantToEnd("Yeniden Denemek İster Misiniz? (Evet/Hayır)", "Hayır");
            if (request == true){
                getTime();
                counter++;
            }
            else {
                System.out.println("Teşekkürler. Oyunu " + counter + " kez oynadınız.");
                System.exit(0);
            }
        }
    }
    public static boolean wantToEnd(String question, String negativeAnswer) {
        boolean retVal = true;
        Scanner scan = new Scanner(System.in);
        System.out.print("\t" + question + ": ");
        String answer = scan.next();

        retVal = answer.equalsIgnoreCase(negativeAnswer);
        scan.nextLine();
        return !retVal;
    }

    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
        }
        System.out.println("================================");*/
        //getFindDate();
        //getPatternDate();
        getTime();

    }
}
