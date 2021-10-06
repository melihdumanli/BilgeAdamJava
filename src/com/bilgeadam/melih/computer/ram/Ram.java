package com.bilgeadam.melih.computer.ram;

import com.bilgeadam.melih.computer.Pc;

public class Ram extends Pc {
    protected String capacity;
    protected int frequency;
    protected String type;

    public Ram() {
    }

    public Ram(String name, String model, int price, String capacity, int frequency, String type) {
        super(name, model, price);
        this.capacity = capacity;
        this.frequency = frequency;
        this.type = type;
    }

}
