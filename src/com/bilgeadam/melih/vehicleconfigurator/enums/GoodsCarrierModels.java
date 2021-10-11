package com.bilgeadam.melih.vehicleconfigurator.enums;

public enum GoodsCarrierModels {
    CADDY_CARGO(190,6.5), CADDY_CARGO_MAXI(185,6.8), TRANSPORTER_PANEL_VAN(195,7.4), TRANSPORTER_PIKAP(178,7.6), CRAFTER_PANEL_VAN(182,7.7);

    int maxSpeed;
    double fuelConsumption;

    GoodsCarrierModels(int maxSpeed, double fuelConsumption) {
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
