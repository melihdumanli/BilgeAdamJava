package com.bilgeadam.melih.odev20210930;

import java.util.*;

public class WeatherForecast {

    // il ilçe ulke kodunu alsın
    public static Map<String, Object> getCountyReading() {
        Scanner klavye = new Scanner(System.in);
        String ilce, il, ulke;
        Map<String, Object> mapList = new HashMap<String, Object>();
        System.out.println("Lütfen ilceyi giriniz ");
        ilce = klavye.nextLine().toLowerCase();
        System.out.println("Lütfen ili giriniz ");
        il = klavye.nextLine().toLowerCase();
        System.out.println("Lütfen ülke kodunu giriniz ");
        ulke = klavye.nextLine().toLowerCase();
        mapList.put("ilce", ilce);
        mapList.put("il", il);
        mapList.put("ulke", ulke);
// return (Map<String, Object>) mapList;
        return mapList;
    }
    //
    public static String getLatitudeLongitude(Map<String, Object> list) {
// enlem,boylam
        String latit, longi;
        for (String temp : list.keySet()) {
            System.out.print(temp + " ");
        }
// System.out.println(
// BAUtils.getDirectData((String) list.get("ilce"), (String) list.get("il"),
// (String) list.get("ulke")));
        String value = BAUtils.getDirectData((String) list.get("ilce"), (String) list.get("il"),
                (String) list.get("ulke"));
        System.out.println(value);
        return value;
    }
    // BAUtils.getDirectData("Merkez", "Balikesir", "TR")
    public static void main(String[] args) {
        //getLatitudeLongitude(getCountyReading());
        latLon();
    }
    public static void latLon() {
        List<String> newArrayList = new ArrayList();

        String latLon = getLatitudeLongitude(getCountyReading());
        StringTokenizer tokenizer = new StringTokenizer(latLon,",");
        /*while (tokenizer.hasMoreTokens()){
            newArrayList.add(tokenizer.nextToken(","));
            //System.out.println(newArrayList);;
        }
        String str = newArrayList.get(0);
        System.out.println(str);*/
        System.out.println(tokenizer.countTokens());

        String[] str = new String[tokenizer.countTokens()];
        for (int i = 0; i < tokenizer.countTokens(); i++) {
            str[i] = tokenizer.nextToken();
            System.out.println(str[i]);
        }






    }
}

