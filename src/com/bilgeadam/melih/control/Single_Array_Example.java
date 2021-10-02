package com.bilgeadam.melih.control;

import java.util.Scanner;

public class Single_Array_Example {
    public static void main(String[] args) {
       // BAUtils.header("WELCOME TO ARRAYS");
        Single_Array_Example array = new Single_Array_Example();
        int[] newArray = array.randomCalculator();
        System.out.println("Oluşturulan Dizi:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
        int toplam = array.toplam();
        System.out.println(toplam);

        /*System.out.println(Arrays.stream(array).sum());
        System.out.println(Arrays.stream(array).count());
        System.out.println(Arrays.stream(array).average());*/

    }
    public static int numberOfElement() {
        System.out.println("Lütfen Dizinin Eleman Sayısını Giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static int topNumber() {
        System.out.println("Lütfen Dizinin Üst Sınır Sayısını Giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int topNumber = scanner.nextInt();
        return topNumber;
    }

    public static int[] randomCalculator () {
        int[] newArray = new int[numberOfElement()];
        java.util.Random randomClass = new java.util.Random();
        for (int j = 0; j < numberOfElement(); j++) {
            newArray [j] = randomClass.nextInt(topNumber())+1;
        }

        return newArray;

    }

    public int toplam() {
        int[] array2 = new int[0];
        int toplam = 0;
        for (int i = 0; i <= randomCalculator().length; i++) {
            toplam = toplam + array2[i];
        }

        return toplam;
    }
    public int oddEven() {
        int[] array3 = randomCalculator();
        int evenNumber =0;
        int oddNumber=0;
        for (int i = 0; i < randomCalculator().length; i++) {
            if (array3[i] % 2 == 0)
                evenNumber++;
            else
                oddNumber++;
        }
        return evenNumber;
    }


}
/*
package com.bilgeadam.a013.arrays;



        import java.util.Random;
        import java.util.Scanner;



// dizinin elemanısını kullanıcı girecek
// 1 ile kullanıcının vermiş olduğu sayı aralığında sayıları random olarak
// gelsin
// rastgele gelen sayıları dizilere atayacak.
// 4 5 6 98 5



// Eklenen bütün sayıları göstersin
// toplamlarını ?
// ortalaması ?
// bu sayılardan kaç tane çift var ?
// kaç tane tek sayı ?
// dizinin ilk elemanı nedir ?
// dizinin son elemanı nedir ?



// tek sayıları bir diziye atayalım
// çift sayıları bir diziye atayalım



// rastgele sayılardan hangileri asaldır ?
// rastgele sayılardan en küçüğünün faktöriyel ?



// ana Method static olsun ancak diğer metotlar static olmasın ?



public class Dizi_Ornek_001_ortalama {

    // dizinin eleman sayısı
    public static int numberOfElement() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen dizinin eleman sayısı");
        int number = klavye.nextInt();
        return number;
    }

    // rastgele için üst sayı giriniz
    public static int topNumber() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen rastgele sayı için üst indisi giriniz.");
        int number = klavye.nextInt();
        return number;
    }

    // random sayılar
    public static int[] randomArray() {
// tek boyutlu dizi eleman sayısı
        int[] dizi = new int[numberOfElement()];

// rastgele sayılar
        Random randomNumber = new Random();
        int topIndis = topNumber();
        int number;

        for (int i = 0; i < dizi.length; i++) {
            number = randomNumber.nextInt(topIndis) + 1;
            dizi[i] = number;
        }
        return dizi;

    }

// Eklenen bütün sayıları göstersin
// toplamlarını ?
// ortalaması ?
// bu sayılardan kaç tane çift var ?
// kaç tane tek sayı ?
// dizinin ilk elemanı nedir ?
// dizinin son elemanı nedir ?

    public static void allElementArray() {
// toplam
        int toplam = 0, tekSayilar = 0, ciftSayilar = 0;
        double ortalama = 0.0;

// iterative =indis sayısı bize lazımsa
        int[] dizi = randomArray();
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
            toplam = toplam + dizi[i];
            if (dizi[i] % 2 == 0) {
                ciftSayilar++;
            } else {
                tekSayilar++;
            }

        }
        System.out.println("\ntoplamları: " + toplam);
        System.out.println("ortalaması: " + (ortalama = toplam / (dizi.length)));
        System.out.println("Tek sayılar: " + tekSayilar);
        System.out.println("Çift sayılar: " + ciftSayilar);
        System.out.println("dizinin ilk elemanı: " + dizi[0]);
        System.out.println("dizinin son elemanı: " + dizi[dizi.length - 1]);
    }

// tek sayıları bir diziye atayalım
// çift sayıları bir diziye atayalım

// rastgele sayılardan hangileri asaldır ?
// rastgele sayılardan en küçüğünün faktöriyel ?

    public static void main(String[] args) {
        allElementArray();
    }

}
*/