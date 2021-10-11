package com.bilgeadam.melih.animalplanet.main;

import com.bilgeadam.melih.animalplanet.omurgali.kuslar.KusTurleri;
import com.bilgeadam.melih.animalplanet.omurgali.kuslar.Kuslar;
import com.bilgeadam.melih.animalplanet.omurgasiz.kabuklular.Kabuklular;

public class Main {
    public static void main(String[] args) {
        //parametreli
        Kuslar kus1= new Kuslar();
        kus1.setName(KusTurleri.Papagan.name());
        kus1.setHareket("Omurgalı Uç");
        kus1.setCo2tuketim("Omurgalı Az Tüketim");
        kus1.setUreme("Omurgalı Üremesin mi?");
        kus1.setYumurta("Omurgalı Mavi Yumurta");
        System.out.println(kus1);

        System.out.println("------------------");
        //parametresiz
        Kabuklular kabuklu1 = new Kabuklular(null, "Omurgasız Kabuklu Üreme", "Omurgasız Kabuklu Tüketim", "Omurgasız Hareket", "Omurgasız Dış İskelet");
        System.out.println(kabuklu1);
    }
}
