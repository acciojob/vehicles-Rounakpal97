package com.driver;

public class Car extends Vehicle {
    private int numberOfDoors;
    private boolean isConvertible;
    private String model;
    private int year;

    // 7-argument constructor (the one tests expect)
    public Car(String name, int maxSpeed, int mileage, int numberOfDoors, boolean isConvertible, String model, int year) {
        super(name, maxSpeed, mileage);
        this.numberOfDoors = numberOfDoors;
        this.isConvertible = isConvertible;
        this.model = model;
        this.year = year;
    }

    // Getters
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
