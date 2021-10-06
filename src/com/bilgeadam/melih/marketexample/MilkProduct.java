package com.bilgeadam.melih.marketexample;

public class MilkProduct extends PackedUnpackedProduct{

    public MilkProduct(String EAN, String name, float price, int VATRate, int minStock, boolean packed) {
        super(EAN, name, price, VATRate, minStock, packed);
    }
}
