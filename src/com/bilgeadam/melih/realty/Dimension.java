package com.bilgeadam.melih.realty;

import java.io.Serial;
import java.io.Serializable;

public class Dimension implements Serializable {
    @Serial
    private static final long serialVersionUID = 6034207456876805089L;
    private double lenght;
    private double width;

    public Dimension(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "lenght=" + lenght +
                ", width=" + width +
                '}';
    }

    public double getArea(){
        return width*lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }
}
