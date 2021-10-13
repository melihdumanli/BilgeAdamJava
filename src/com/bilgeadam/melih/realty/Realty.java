package com.bilgeadam.melih.realty;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public abstract class Realty implements Serializable {
    @Serial
    private static final long serialVersionUID = 658196133302073079L;
    private String      name;
    private Adress      adr;
    private Dimension   dim;
    private LocalDate   listingDate;
    private double      price;

    public Realty(String name, Adress adr, Dimension dim, LocalDate listingDate) {
        this.name        = name;
        this.adr         = adr;
        this.dim         = dim;
        this.listingDate = listingDate;
        this.price       =0.0;
    }

    @Override
    public String toString() {
        return "Realty{" +
                "name='" + name + '\'' +
                ", adr=" + adr +
                ", dim=" + dim +
                ", listingDate=" + listingDate +
                '}';
    }

    public String getName() {
        return name;
    }

    public Adress getAdr() {
        return adr;
    }

    public Dimension getDim() {
        return dim;
    }

    public LocalDate getListingDate() {
        return listingDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
