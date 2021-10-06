package com.bilgeadam.melih.computer.cpu;

import com.bilgeadam.melih.computer.Pc;

import java.nio.charset.StandardCharsets;

public class Cpu extends Pc {

    protected int numberOfPins;
    protected boolean isOverHeated;

    public Cpu() {
    }

    public Cpu(String name, String model, int price, int numberOfPins, boolean isOverHeated) {
        super(name, model, price);
        this.numberOfPins = numberOfPins;
        this.isOverHeated = isOverHeated;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", numberOfPins=" + numberOfPins +
                ", isOverHeated=" + isOverHeated +
                "} " ;
    }

    public void cpuTest(){
        System.out.println(this.name.concat(" " + this.model).concat(" " + this.price).concat(" " + String.valueOf(this.numberOfPins)).concat(String.valueOf(this.isOverHeated)));
    }

    public int getNumberOfPins() {
        return numberOfPins;
    }

    public void setNumberOfPins(int numberOfPins) {
        this.numberOfPins = numberOfPins;
    }

    public boolean isOverHeated() {
        return isOverHeated;
    }

    public void setOverHeated(boolean overHeated) {
        isOverHeated = overHeated;
    }
}
