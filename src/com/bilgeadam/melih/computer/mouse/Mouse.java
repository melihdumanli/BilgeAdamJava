package com.bilgeadam.melih.computer.mouse;

import com.bilgeadam.melih.computer.Pc;

public class Mouse extends Pc {
    protected int dpi;
    protected boolean isWired;

    public Mouse(int dpi, boolean isWired) {
        this.dpi = dpi;
        this.isWired = isWired;
    }

    public Mouse(String name, String model, int price, int dpi, boolean isWired) {
        super(name, model, price);
        this.dpi = dpi;
        this.isWired = isWired;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", dpi=" + dpi +
                ", isWired=" + isWired +
                "} " ;
    }
    public void mouseTest(){

    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public boolean isWired() {
        return isWired;
    }

    public void setWired(boolean wired) {
        isWired = wired;
    }
}
