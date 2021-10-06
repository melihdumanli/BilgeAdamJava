package com.bilgeadam.melih.computer.cpu;

import com.bilgeadam.melih.control.ValueOf;

import java.nio.charset.StandardCharsets;

public class Cpu1 extends Cpu{

    public Cpu1() {
    }

    public Cpu1(String name, String model, int price, int numberOfPins, boolean isOverHeated) {
        super(name, model, price, numberOfPins, isOverHeated);
    }

    @Override
    public String toString() {
        return "Cpu1{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", numberOfPins=" + numberOfPins +
                ", isOverHeated=" + isOverHeated +
                "} ";
    }

    public void testCpu1(){
        System.out.println(this.name.concat(" " + this.model).concat(" " + this.price).concat(" " + String.valueOf(this.numberOfPins)).concat(String.valueOf(this.isOverHeated)));
    }

}
