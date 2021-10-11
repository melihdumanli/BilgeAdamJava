package com.bilgeadam.melih.vehicleconfigurator.personal;

public class PersonalUseOnly {
    protected String segment;
    protected String equipmentLines;
    protected String bodyType;

    public PersonalUseOnly() {
    }

    public PersonalUseOnly(String segment, String equipmentLines, String bodyType) {
        this.segment = segment;
        this.equipmentLines = equipmentLines;
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "PersonalUseOnly{" +
                "Segment='" + segment + '\'' +
                ", Donanım Paketi='" + equipmentLines + '\'' +
                ", Gövde Tipi='" + bodyType + '\'' +
                '}';
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getEquipmentLines() {
        return equipmentLines;
    }

    public void setEquipmentLines(String equipmentLines) {
        this.equipmentLines = equipmentLines;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
}
