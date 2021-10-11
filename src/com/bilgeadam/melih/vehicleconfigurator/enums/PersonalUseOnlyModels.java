package com.bilgeadam.melih.vehicleconfigurator.enums;

public enum PersonalUseOnlyModels {
    POLO(185,5.5, "Hatch Back"), GOLF_8(198,5.7,"Hatch Back"), GOLF_8_ESTATE(192,5.9,"Station Wagon"), PASSAT(212,6.2,"Sedan"), PASSAT_ESTATE(208,6.5,"Station Wagon"), ARTEON(219,7.2,"Sedan"), T_ROC(187,6.2,"SUV"),TIGUAN(192,6.6, "SUV"), TIGUAN_ALLSPACE(190,6.8,"SUV"), TOUAREG(202,6.4,"SUV");
    private final int maxSpeed;
    private final double fuelConsumption;
    private final String bodyType;

    PersonalUseOnlyModels(int maxSpeed, double fuelConsumption,String bodyType) {
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.bodyType = bodyType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String getBodyType(){
        return bodyType;
    }
}
