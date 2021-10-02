package com.bilgeadam.melih.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Menu {
    public static int random(int random) {
        Random rnd = new Random();
        return rnd.nextInt(random);
    }


    public static String starters() {
        List<String> starters = new ArrayList<>();
        starters.add("Şehriye Çorbası, "); //136
        starters.add("Mercimek Çorbası, "); //137
        starters.add("Ezogelin Çorbası, ");//95
        starters.add("Yayla Çorbası, ");//98
        starters.add("Domates Çorbası, ");//66
        starters.add("Düğün Çorbası, ");//93
        starters.add("Tavuk Suyu Çorbası, ");//117
        String starter = starters.get(random(starters.size()));
        return starter;
    }

    public static String sideDishes() {
        List<String> sideDishes = new ArrayList<>();
        sideDishes.add("Mevsim Salata, ");//59
        sideDishes.add("Pirinç Pilavı, "); //259
        sideDishes.add("Bulgur Pilavı, ");//149
        sideDishes.add("Yoğurt, ");//122
        sideDishes.add("Makarna, ");//141
        sideDishes.add("Piyaz, ");//162
        sideDishes.add("İçli Köfte, ");//349
        String sideDish = sideDishes.get(random(sideDishes.size()));
        return sideDish;
    }
    public static String mainCourses() {
        List<String> mainCourses = new ArrayList<>();
        mainCourses.add("Etli Nohut, "); //285
        mainCourses.add("Kuru Fasulye, ");//197
        mainCourses.add("Sebzeli Köfte, ");//251
        mainCourses.add("Tavuk Sote, ");//288
        mainCourses.add("Orman Kebabı, ");//256
        mainCourses.add("Zeytinyağlı Barbunya, ");//356
        mainCourses.add("Balık Izgara, ");//230
        String mainCourse = mainCourses.get(random(mainCourses.size()));
        return mainCourse;
    }
    public static String desserts() {
        List<String> desserts = new ArrayList<>();
        desserts.add("Künefe, ");//426
        desserts.add("İrmik Helvası, ");//532
        desserts.add("Hayrabolu, ");//592
        desserts.add("Revani, ");//697
        desserts.add("Fırın Sütlaç, ");//286
        desserts.add("Ayva Tatlısı, ");//426
        desserts.add("Fıstıklı Baklava, ");//659
        String dessert = desserts.get(random(desserts.size()));
        return dessert;
    }
    public static String drinks() {
        List<String> drinks = new ArrayList<>();
        drinks.add("Ayran, ");//75
        drinks.add("Kutu Kola, ");//149
        drinks.add("Şalgam Suyu, ");//10
        drinks.add("Soda, ");//0
        drinks.add("Soğuk Çay, ");//129
        drinks.add("Gazoz, ");//190
        drinks.add("Meyve Suyu, ");//100
        String drink = drinks.get(random(drinks.size()));
        return drink;
    }
    public static String days() {
        List<String> days = new ArrayList<>();
        days.add("Pazartesi: ");
        days.add("Salı: ");
        days.add("Çarşamba: ");
        days.add("Perşembe: ");
        days.add("Cuma: ");
        days.add("Cumartesi: ");
        days.add("Pazar: ");
        String day = days.get(random(days.size()));
        return day;
    }
    public static int calorieMap (String food){
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("Şehriye Çorbası, ", 136);
        hashMap.put("Mercimek Çorbası, ", 137);
        hashMap.put("Ezogelin Çorbası, ", 95);
        hashMap.put("Yayla Çorbası, ", 98);
        hashMap.put("Domates Çorbası, ", 66);
        hashMap.put("Düğün Çorbası, ", 93);
        hashMap.put("Tavuk Suyu Çorbası, ", 117);
        hashMap.put("Mevsim Salata, ", 59);
        hashMap.put("Pirinç Pilavı, ", 259);
        hashMap.put("Bulgur Pilavı, ", 149);
        hashMap.put("Yoğurt, ", 122);
        hashMap.put("Makarna, ", 141);
        hashMap.put("Piyaz, ", 162);
        hashMap.put("İçli Köfte, ", 349);
        hashMap.put("Etli Nohut, ", 285);
        hashMap.put("Kuru Fasulye, ", 197);
        hashMap.put("Sebzeli Köfte, ", 251);
        hashMap.put("Tavuk Sote, ", 288);
        hashMap.put("Orman Kebabı, ", 256);
        hashMap.put("Zeytinyağlı Barbunya, ", 356);
        hashMap.put("Balık Izgara, ", 230);
        hashMap.put("Künefe, ", 426);
        hashMap.put("İrmik Helvası, ", 532);
        hashMap.put("Hayrabolu, ", 592);
        hashMap.put("Revani, ", 697);
        hashMap.put("Fırın Sütlaç, ", 286);
        hashMap.put("Ayva Tatlısı, ", 426);
        hashMap.put("Fıstıklı Baklava, ", 659);
        hashMap.put("Ayran, ", 75);
        hashMap.put("Kutu Kola, ", 149);
        hashMap.put("Şalgam Suyu, ", 10);
        hashMap.put("Soda, ", 0);
        hashMap.put("Soğuk Çay, ", 129);
        hashMap.put("Gazoz, ", 190);
        hashMap.put("Meyve Suyu, ", 100);
        int calories = hashMap.get(food);
        return calories;
    }


}