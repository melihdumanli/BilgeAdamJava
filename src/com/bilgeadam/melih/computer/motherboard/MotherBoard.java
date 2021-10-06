package com.bilgeadam.melih.computer.motherboard;

import com.bilgeadam.melih.computer.Pc;

public class MotherBoard extends Pc {
    protected String size;


    public MotherBoard() {
    }

    public MotherBoard(String name, String model, int price, String size) {
        super(name, model, price);
        this.size = size;
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                "} ";
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
