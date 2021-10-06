package com.bilgeadam.melih.marketexample;

import java.util.Date;

public class PackageGood extends Product{
    protected Date expirationDate;

    public PackageGood(String EAN, String name, float price, int VATRate, int minStock, Date expirationDate) {
        super(EAN, name, price, VATRate, minStock);
        this.expirationDate = expirationDate;
    }
}
