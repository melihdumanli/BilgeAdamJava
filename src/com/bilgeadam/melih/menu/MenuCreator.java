package com.bilgeadam.melih.menu;


import java.util.*;

public class MenuCreator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

         do {
            welcomeScenario();
            //exitRequest();
        } while (exitRequest() == false);
    }

    private static void welcomeScenario() {
        header("Menü Hazırlama Programına Hoşgeldiniz");
        boolean checkVal;
        checkVal = query("Günlük Kalori İhtiyacınızı Hesaplamak İster Misiniz? (Evet/Hayır) :", "Hayır");
        if (checkVal == false)
            bmrAmrCalculator();
        else
            menuQuery();
    }

    private static void bmrAmrCalculator() {
        String gender = null;
        int scanVal =0;
        double age =0, weight =0, height=0, bmr=0, amr=0;
        int activity =0;
        while (scanVal !=1 && scanVal !=2){
            System.out.println("Lütfen Cinsiyetinizi Giriniz (Erkek/Kadın) : ");
            gender = scanner.next();
            if(gender.equalsIgnoreCase("erkek"))
                scanVal =1;
            else if (gender.equalsIgnoreCase("kadın"))
                scanVal =2;
            else
                System.out.println("Hatalı Giriş Yaptınız. Lütfen Tekrar Deneyiniz :");
        }
        
        System.out.println("Lütfen Yaşınızı Giriniz : ");
        age = scanner.nextInt();
        System.out.println("Lütfen Boyunuzu Cm Olarak Giriniz : ");
        height = scanner.nextInt();
        System.out.println("Lütfen Kilonuzu Giriniz : ");
        weight = scanner.nextInt();
        do {
            System.out.println("Lütfen Aktivite Durumunuzu Aşağıdaki Seçeneklerden Size Uygun Olanı Seçerek Belirtiniz : ");
            System.out.println("1- Hareketsiz (Az veya Hiç Egzersiz)");
            System.out.println("2- Hafif Aktif (Haftada 1-2 Gün Egzersiz)");
            System.out.println("3- Orta Derecede Aktif (Haftada 3-5 Gün Egzersiz)");
            System.out.println("4- Aktif (Haftada 6-7 Gün Egzersiz)");
            System.out.println("5- Oldukça Aktif (Haftada 6-7 Gün Ağır Antrenman)");
            activity = scanner.nextInt();
            if (activity<1 || activity>5)
                System.out.println("Hatalı Bir Değer Girdiniz...");
        }while (activity<1 || activity>5);
        if (scanVal ==1){
            bmr = 66.47+(13.75*weight)+(5.003*height)-(6.755*age);
            amr = switch (activity) {
                case 1: {

                    yield bmr*1.2;
                }
                case 2: {

                    yield bmr*1.375;
                }
                case 3: {

                    yield bmr*1.55;
                }
                case 4: {

                    yield bmr*1.725;
                }
                case 5: {

                    yield bmr*1.9;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + activity);
            };
            System.out.println("Aktif Metabolizma Hızınız Günlük " + Math.round(amr) + " kaloridir.");
            System.out.println("*Bu Değerlerden Daha Fazla Kalori Almanız Durumunda Kilo Alacağınızı, Kilo Vermek İçin İse Günlük Tüketeceğiniz Kalori Miktarının Bu Değerlerden Az Olması Gerektiğini Hatırlatırız.*");
            System.out.println("**Bu Değerler Tavsiye Niteliğinde Olup Gerçek Değerler İçin Sağlık Kuruluşunuzla İletişime Geçmeniz Gerekmektedir.");
        }
        else if (scanVal == 2) {
            bmr = 655.1+(9.563*weight)+(1.850*height)-(4.676*age);
            amr = switch (activity) {
                case 1: {

                    yield bmr*1.2;
                }
                case 2: {

                    yield bmr*1.375;
                }
                case 3: {

                    yield bmr*1.55;
                }
                case 4: {

                    yield bmr*1.725;
                }
                case 5: {

                    yield bmr*1.9;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + activity);
            };
            System.out.println("Aktif Metabolizma Hızınız Günlük " + Math.round(amr) + " kaloridir.");
            System.out.println("*Bu Değerlerden Daha Fazla Kalori Almanız Durumunda Kilo Alacağınızı, Kilo Vermek İçin İse Günlük Tüketeceğiniz Kalori Miktarının Bu Değerlerden Az Olması Gerektiğini Hatırlatırız.*");
            System.out.println("**Bu Değerler Tavsiye Niteliğinde Olup Gerçek Değerler İçin Sağlık Kuruluşunuzla İletişime Geçmeniz Gerekmektedir.");
        }
        System.out.println("");
        System.out.println("");
        menuQuery();
    }

    public static void menuQuery() {
        String start, side,main,dessert,drink;
        int calories =0;
        start= Menu.starters();
        side = Menu.sideDishes();
        main = Menu.mainCourses();
        dessert = Menu.desserts();
        drink = Menu.drinks();
        StringBuilder builder = new StringBuilder();
        builder.append(start).append(side).append(main).append(dessert).append(drink);
        System.out.println("Şefin Tavsiyesi : " + builder);
        calories = Menu.calorieMap(start);
        calories = calories + Menu.calorieMap(side);
        calories = calories + Menu.calorieMap(main);
        calories = calories + Menu.calorieMap(dessert);
        calories = calories + Menu.calorieMap(drink);
        System.out.println("Toplam Kalori Miktarı : " + calories);
    }

    public static boolean exitRequest() {
        boolean retVal;
        retVal = query("Yeniden Denemek İster Misiniz? (Evet/Hayır) :", "Hayır");
        return retVal;
    }
    public static boolean query(String question, String Answer) {
        boolean retVal = true;
        System.out.println(question);
        String answer = scanner.next();
        retVal = answer.equalsIgnoreCase(Answer);
            return retVal;
    }
    public static int random(int random) {
        Random rnd = new Random();
        return rnd.nextInt(random);
    }
    public static void header (String title) {
//		===========
//		** title **
//		===========
        int len = title.length();
        StringBuilder row = new StringBuilder("");

        for (int i = 0; i < (len + 6); i++) {
            row.append("=");
        }

        System.err.println("\n\n\t\t" + row);
        System.err.println("\t\t** " + title.toUpperCase() + " **");
        System.err.println("\t\t" + row + "\n");
    }

}
