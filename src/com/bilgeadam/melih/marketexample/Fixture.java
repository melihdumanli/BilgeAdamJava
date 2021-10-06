package com.bilgeadam.melih.marketexample;

import java.util.Date;

public class Fixture {
    protected int economicLife;
    protected boolean isRented;
    protected Date purchaseDate;
    protected int inventoryID;
    protected String materials; // enum olabilir
    protected String description;

    public Fixture() {
    }

    public Fixture(int economicLife, boolean isRented, Date purchaseDate, int inventoryID, String materials, String description) {
        this.economicLife = economicLife;
        this.isRented = isRented;
        this.purchaseDate = purchaseDate;
        this.inventoryID = inventoryID;
        this.materials = materials;
        this.description = description;
    }

    public int getEconomicLife() {
        return economicLife;
    }

    public boolean isRented() {
        return isRented;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public int getInventoryID() {
        return inventoryID;
    }

    public String getMaterials() {
        return materials;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return "Fixture{" +
                "economicLife=" + economicLife +
                ", isRented=" + isRented +
                ", purchaseDate=" + purchaseDate +
                ", inventoryID=" + inventoryID +
                ", materials='" + materials + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
