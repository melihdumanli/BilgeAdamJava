package com.bilgeadam.melih.realty;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;

public class RealEstateAgency implements Serializable {
    @Serial
    private static final long serialVersionUID = 5988170863670161629L;
    private String name;
    private Adress adress;
    private HashMap<String , Realty> realties;
    //çalışanlar

    public RealEstateAgency(String name, Adress adress) { // emlak danışmanlığı şirketi
        this.name = name;
        this.adress = adress;
        this.realties = new HashMap<>();
    }

    @Override
    public String toString() {
        return "RealEstateAgency{" +
                "name='" + name + '\'' +
                ", adress=" + adress +
                ", realties=" + realties +
                '}';
    }

    public void addRealty(Realty realty){
        this.realties.put(realty.getName(), realty);
    }

    public Realty getRealty(String name){
        return this.realties.get(name);
    }
}
