package com.bilgeadam.melih.animalplanet.omurgasiz.kabuklular;

import com.bilgeadam.melih.animalplanet.CommonProperties;
import com.bilgeadam.melih.animalplanet.omurgasiz.IOmurgasizHayvanlar;

public class Kabuklular extends CommonProperties implements IOmurgasizHayvanlar {
    private String disIskelet;

    public Kabuklular() {
    }

    public Kabuklular(String name, String ureme, String co2tuketim, String hareket, String disIskelet) {
        super(name, ureme, co2tuketim, hareket);
        this.disIskelet = disIskelet;
    }

    @Override
    public String toString() {
        return "Kabuklular{" +
                "name='" + name + '\'' +
                "ureme='" + ureme + '\'' +
                ", co2tuketim='" + co2tuketim + '\'' +
                ", hareket='" + hareket + '\'' +
                ", disIskelet='" + disIskelet + '\'' +
                "} " ;
    }

    @Override
    public void omurgasiz() {

    }

    @Override
    public void sogukKanli() {

    }

    @Override
    public void acikDolasim() {

    }

    public String getDisIskelet() {
        return disIskelet;
    }

    public void setDisIskelet(String disIskelet) {
        this.disIskelet = disIskelet;
    }
}
