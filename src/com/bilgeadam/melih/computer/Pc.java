package com.bilgeadam.melih.computer;

public class Pc {
    protected String name;
    protected String model;
    protected int price;

    public Pc() {
    }

    public Pc(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public void test(){
        System.out.println(this.model);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
