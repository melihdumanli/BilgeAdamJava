package com.bilgeadam.melih.realty;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class House extends Realty implements Serializable {
    @Serial
    private static final long serialVersionUID = -9177684490802944041L;
    private int numOfRooms;
    private int levelNumber;

    public House(String name, Adress adr, Dimension dim, LocalDate listingDate) {
        super(name, adr, dim, listingDate);
        this.numOfRooms = 0;
        this.levelNumber = 0;
    }

    @Override
    public String toString() {
        return "House{" +
                "numOfRooms=" + numOfRooms +
                ", levelNumber=" + levelNumber +
                "} " + super.toString();
    }


    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }
}
