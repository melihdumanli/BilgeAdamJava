package com.bilgeadam.melih.vehicleconfigurator.commonvariables;

import com.bilgeadam.melih.vehicleconfigurator.enums.Colors;

abstract public class VehicleCommons {
    //özellikler
    private String brand;
    private String model;
    private String engineType;
    private String transmission;
    private Colors color;
    private String fieldOfUse;
    private double maxSpeed;
    private double fuelConsumption;
    private double zeroToHundred;
    private double enginePower;
    private double maxTorque;
    private double price;

    //parametresiz constructor
    public VehicleCommons() {
    }
    // parametreli constructor
    public VehicleCommons(String brand, String engineType, String fieldOfUse, double maxSpeed, double fuelConsumption, double zeroToHundred,double enginePower,double maxTorque,double price) {
        this.brand = brand;
        this.engineType = engineType;
        this.fieldOfUse = fieldOfUse;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.zeroToHundred = zeroToHundred;
        this.enginePower = enginePower;
        this.maxTorque = maxTorque;
        this.price = price;
    }
    //toString

    @Override
    public String toString() {
        return "VehicleCommons{" +
                "Marka='" + brand + '\'' +
                ", Model='" + model + '\'' +
                ", Motor='" + engineType + '\'' +
                ", Şanzıman='" + transmission + '\'' +
                ", Renk='" + color + '\'' +
                ", Kullanım Şekli='" + fieldOfUse + '\'' +
                ", Maksimum Hız=" + maxSpeed + " Km/H" +
                ", Yakıt Tüketimi=" + fuelConsumption + " L/100 Km" +
                ", 0-100 Km/H Hızlanma =" + zeroToHundred + " Saniye "+
                ", Motor Gücü =" + maxTorque + " HP "+
                ", Maksimum Tork =" + maxTorque + " Nm. "+
                ", Fiyat =" + price + " TL "+
                '}';
    }
    // method
    //1. Menüyü Göster
    abstract public void showMenu();
    //2. Araç Tipini Seç
    abstract public void categorySelection();
    //6. Şanzıman Seç
    abstract public void transmissionSelection();
    //7. Renk Seç
    abstract public void colorSelection();

    // getters and setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public String getFieldOfUse() {
        return fieldOfUse;
    }

    public void setFieldOfUse(String fieldOfUse) {
        this.fieldOfUse = fieldOfUse;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getZeroToHundred() {
        return zeroToHundred;
    }

    public void setZeroToHundred(double zeroToHundred) {
        this.zeroToHundred = zeroToHundred;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public double getMaxTorque() {
        return maxTorque;
    }

    public void setMaxTorque(double maxTorque) {
        this.maxTorque = maxTorque;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
