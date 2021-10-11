package com.bilgeadam.melih.vehicleconfigurator.enums;

public enum CommercialSegments {
    PASSENGER_CARRIER(1,"passenger_carrier"), GOODS_CARRIER(2,"goods_carrier");

    private final int number;
    private final String segment;

    CommercialSegments(int number, String segment) {
        this.number = number;
        this.segment = segment;
    }

    public int getNumber() {
        return number;
    }

    public String getSegment() {
        return segment;
    }
}
