package com.bilgeadam.melih.lesson21;

public class Vehicle {
    private String name;
    private String brand;
    private double mass;
    private Color color;
    private double maxSpeed;
    private double currSpeed;

    public Vehicle(String name, String brand, double maxSpeed) {
        this.name = name;
        this.brand = brand;
        this.maxSpeed = this.maxSpeed;
        this.mass = 0.0d;
        this.color = Color.NO_COLOR;
        this.currSpeed = 0.0d;
    }

    public Vehicle(String name, String brand, double mass, Color color, double maxSpeed, double currSpeed) {
        this.name = name;
        this.brand = brand;
        this.mass = mass;
        this.color = Color.NO_COLOR;
        this.maxSpeed = maxSpeed;
        this.currSpeed = currSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getCurrSpeed() {
        return currSpeed;
    }

    public void setCurrSpeed(double currSpeed) {
        this.currSpeed = currSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", mass=" + mass +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currSpeed=" + currSpeed +
                '}';
    }
}
