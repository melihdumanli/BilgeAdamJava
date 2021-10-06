package com.bilgeadam.melih.marketexample;

public enum Unit {
    KG(" KG", "kg"), Litre("Litre", "l"), gram("gram", "g"), adet("adet", "ad"), paket("Paket", "pk");

    private String name;
    private String abbreviation;
    Unit(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public String Unit2String (Unit unit){
        return unit.name;
    }

    public Unit String2Unit( String name){
        if (name.equalsIgnoreCase("KG"))
            return KG;
        else if (name.equalsIgnoreCase("Litre"))
            return Litre;
        else if (name.equalsIgnoreCase("gram"))
            return gram;
        else if (name.equalsIgnoreCase("adet"))
            return adet;
        else if (name.equalsIgnoreCase("paket"))
            return paket;
        return null;
    }
}
