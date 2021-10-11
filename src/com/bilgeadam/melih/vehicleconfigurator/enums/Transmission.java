package com.bilgeadam.melih.vehicleconfigurator.enums;

public enum Transmission {
    SEMI_AUTOMATIC(1,"semi_automatic"), MANUEL(2,"manuel");

    private final int number;
    private final String transmission;

    Transmission(int number, String transmission) {
        this.number = number;
        this.transmission = transmission;
    }

    public int getNumber() {
        return number;
    }

    public String getTransmission() {
        return transmission;
    }
}
