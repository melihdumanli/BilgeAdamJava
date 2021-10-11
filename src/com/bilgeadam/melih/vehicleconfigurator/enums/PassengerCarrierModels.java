package com.bilgeadam.melih.vehicleconfigurator.enums;

public enum PassengerCarrierModels {
    CADDY(190,6.5), TRANSPORTER(198,7.2), CARAVELLE(200,7.4), CRAFTER(188,7.6);
    int maxSpeed;
    double fuelConsumption;

    PassengerCarrierModels(int maxSpeed, double fuelConsumption) {
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
