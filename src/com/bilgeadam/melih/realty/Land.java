package com.bilgeadam.melih.realty;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class Land extends Realty implements Serializable {
    @Serial
    private static final long serialVersionUID = 8283462854086380922L;

    public Land(String name, Adress adr, Dimension dim, LocalDate listingDate) {
        super(name, adr, dim, listingDate);
    }
    public Land(String name, Adress adr, Dimension dim, LocalDate listingDate, double price) {
        super(name, adr, dim, listingDate);
        this.setPrice(price);
    }

    @Override
    public String toString() {
        return "Land{} " + super.toString();
    }
}
