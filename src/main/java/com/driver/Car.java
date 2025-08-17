package com.driver;

public class Car extends Vehicle {
    private int numberOfDoors;
    private boolean isManual;
    private String model;
    private int seats;

    // For gear/speed tracking
    private int currentSpeed;
    private int currentGear;

    // Constructor with all args (as required by tests)
    public Car(String name, int speed, int fuel, int numberOfDoors, boolean isManual, String model, int seats) {
        super(name, speed, fuel);
        this.numberOfDoors = numberOfDoors;
        this.isManual = isManual;
        this.model = model;
        this.seats = seats;
        this.currentGear = 1; // default
        this.currentSpeed = 0;
    }

    // Methods expected in tests
    public void changeGear(int gear) {
        this.currentGear = gear;
    }

    public void changeSpeed(int speed, int gear) {
        this.currentSpeed = speed;
        this.currentGear = gear;
    }

    // Getters
    public int getCurrentGear() {
        return currentGear;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
