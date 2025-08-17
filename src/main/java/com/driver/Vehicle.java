package com.driver;

public class Vehicle {
    private String name;
    private int speed;
    private int fuel;

    // Constructor 1
    public Vehicle(String name) {
        this.name = name;
    }

    // Constructor 2 (needed for Car)
    public Vehicle(String name, int speed, int fuel) {
        this.name = name;
        this.speed = speed;
        this.fuel = fuel;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFuel() {
        return fuel;
    }
}
