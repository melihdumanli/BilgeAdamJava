package com.bilgeadam.melih.marketexample;

public class Product {
    protected String EAN; // european article number
    protected String name;
    protected float price;
    protected int VATRate;
    protected int currentStock;
    protected int minStock;

    public Product(String EAN, String name, float price, int VATRate, int minStock) {
        this.EAN = EAN;
        this.name = name;
        this.price = price;
        this.VATRate = VATRate;
        this.minStock = minStock;
    }

    public Product(String EAN, String name, float price, int VATRate, int minStock, int currentStock) {
        super();
        this.EAN = EAN;
        this.name = name;
        this.price = price;
        this.VATRate = VATRate;
        this.minStock = minStock;
        this.currentStock = currentStock;
    }

    public String getEAN() {
        return EAN;
    }

    public void setEAN(String EAN) {
        this.EAN = EAN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getVATRate() {
        return VATRate;
    }

    public void setVATRate(int VATRate) {
        this.VATRate = VATRate;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(int currentStock) {
        this.currentStock = currentStock;
    }

    public int getMinStock() {
        return minStock;
    }

    public void setMinStock(int minStock) {
        this.minStock = minStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "EAN='" + EAN + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", VATRate=" + VATRate +
                ", currentStock=" + currentStock +
                ", minStock=" + minStock +
                '}';
    }
}



