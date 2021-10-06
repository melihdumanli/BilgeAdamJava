package com.bilgeadam.melih.computer.cpu;

public class Cpu2 extends Cpu{

    public Cpu2() {
    }

    public Cpu2(String name, String model, int price, int numberOfPins, boolean isOverHeated) {
        super(name, model, price, numberOfPins, isOverHeated);
    }

    @Override
    public String toString() {
        return "Cpu2{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", numberOfPins=" + numberOfPins +
                ", isOverHeated=" + isOverHeated +
                "} ";
    }

    public void testCpu2(){
        System.out.println(this.name.concat(" " + this.model).concat(" " + this.price).concat(" " + String.valueOf(this.numberOfPins)).concat(String.valueOf(this.isOverHeated)));
    }

}
