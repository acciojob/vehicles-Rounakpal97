package com.driver;

public class F1 extends Car {

    // Match Car constructor (7 parameters!)
    public F1(String name, int speed, int fuel, int numberOfDoors, boolean isManual, String model, int seats) {
        super(name, speed, fuel, numberOfDoors, isManual, model, seats);
    }

    // Extra methods for racing
    public void accelerate(int speedChange, int gearChange) {
        changeSpeed(getCurrentSpeed() + speedChange, gearChange);
    }
}
