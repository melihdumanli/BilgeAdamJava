package com.bilgeadam.melih.marketexample;

public class Vegetable extends PackedUnpackedProduct{

    public Vegetable(String EAN, String name, float price, int VATRate, int minStock, boolean packed) {
        super(EAN, name, price, VATRate, minStock, packed);
    }
}
