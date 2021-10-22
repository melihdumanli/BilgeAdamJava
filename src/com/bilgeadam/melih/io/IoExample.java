package com.bilgeadam.melih.io;

import com.bilgeadam.BAUtils.BAUtils;

import java.io.*;
import java.util.Scanner;

public class IoExample {

// 1.adım static bir path yapalım değeri C:\\bilgeadam\\dosya.txt
// 2.adım Kullanıcı tarafından Birşeyler yazıp oluşturduğumuz dosya içisine
// yazalım
// 3.adım dosya içerisindeki yazıları okuyalım.
// 4.adım dosya içerisindeki bütün ı harflerini i yapalım

public static final String PATH(){
    final String PATH = "C:\\bilgeadam\\dosya.txt";
    return PATH;
}


    public static void Writer(){
        //Scanner scanner = new Scanner(System.in);
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH(),true))) {
          // while (BAUtils.proceeding("Yeni Metin Girmek İster Misiniz? (Evet/Hayır)", "Hayır") == false) {
               bufferedWriter.write(BAUtils.readString("Lütfen Bir Metin giriniz:"));
               bufferedWriter.flush();
               //scanner.nextLine();
           //}
            System.out.println("Yazma İşlemi Tamamlandı...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void Reader() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH()))) {
        	String satir="",toplamOkunan ="";
            while ((satir=bufferedReader.readLine()) != null) {
            	toplamOkunan = toplamOkunan + satir +"\n";
                
            }
            System.out.println(toplamOkunan);
            //bufferedReader.close();
            System.out.println("Okuma İşlemi Tamamlandı...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*public static void CharacterChanger(){
        System.out.println("Lütfen Bir kelime giriniz");

        String valueChange = klavye2.nextLine().toLowerCase();

        String newValue = "";



// ş

        System.out.println("değiştirmek istediğiniz harfi giriniz");

        String changeLetterOld = klavye2.nextLine();



// s

        System.out.println("değiştirilecek harfi giriniz");

        String changeLetterNew = klavye2.nextLine();



// nevşehir

        for (int i = 0; i < valueChange.length(); i++) {

            if (valueChange.charAt(i) == changeLetterOld.charAt(0)) {

                newValue = valueChange.replace((valueChange.charAt(i)),

                        (changeLetterNew.charAt(0)));

            }

        }

        System.out.println("ilk hali: " + valueChange);

        System.out.println("değişmiş hali: " + newValue);

    }*/



    public static void main(String[] args) {
    	BAUtils.header("Welcome To IO");
        Writer();
        if(BAUtils.proceeding("Okuma İşlemi Yapmak İster Misiniz? (Evet/Hayır)","Hayır") ==false)
            Reader();
        

    }


}
