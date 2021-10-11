package com.bilgeadam.melih.vehicleconfigurator.enums;

public enum PersonalUseOnlySegments {
    CITY_CAR(1,"city_car"), SUPERMINI(2, "supermini"), SMALL_FAMILY(3,"small_family"), LARGE_FAMILY(4,"large_family"), EXECUTIVE(5,"executive"), LUXURY_SALOON(6,"luxury_saloon");

    private final int number;
    private final String segment;

    PersonalUseOnlySegments(int number, String segment) {
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
