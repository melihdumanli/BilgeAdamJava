package com.bilgeadam.melih.animalplanet.omurgali.kuslar;

import com.bilgeadam.melih.animalplanet.CommonProperties;
import com.bilgeadam.melih.animalplanet.omurgali.IOmurgaliHayvanlar;

public class Kuslar extends CommonProperties implements IOmurgaliHayvanlar {
    private String yumurta;

    public Kuslar() {
    }

    public Kuslar(String name, String ureme, String co2tuketim, String hareket, String yumurta) {
        super(name, ureme, co2tuketim, hareket);
        this.yumurta = yumurta;
    }

    @Override
    public String toString() {
        return "Kuslar{" +
                "name='" + name + '\'' +
                "ureme='" + ureme + '\'' +
                ", co2tuketim='" + co2tuketim + '\'' +
                ", hareket='" + hareket + '\'' +
                ", yumurta='" + yumurta + '\'' +
                "} " ;
    }

    @Override
    public void omurgali() {

    }

    @Override
    public void sicakKanli() {

    }

    @Override
    public void kapaliDolasim() {

    }

    public String getYumurta() {
        return yumurta;
    }

    public void setYumurta(String yumurta) {
        this.yumurta = yumurta;
    }
}
