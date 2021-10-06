package com.bilgeadam.melih.computer.keyboard;

import com.bilgeadam.melih.computer.Pc;

public class Keyboard extends Pc {
    protected boolean isMechanic;

    public Keyboard() {
    }

    public Keyboard(String name, String model, int price, boolean isMechanic) {
        super(name, model, price);
        this.isMechanic = isMechanic;
    }


    @Override
    public String toString() {
        String klavye = isMechanic ? "Mekanik" : "Mekanik Değil";

        return "Keyboard{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isMechanic=" + klavye +
                "} ";
    }

    public void keyboardTest() {
        System.out.println();
    }

    public boolean isMechanic() {
        return isMechanic;
    }

    public void setMechanic(boolean mechanic) {
        isMechanic = mechanic;
    }
}
