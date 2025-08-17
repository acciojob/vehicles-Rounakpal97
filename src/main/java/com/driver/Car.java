package com.driver;

public class Car extends Vehicle {
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private String type;
    private int seats;
    private int wheels;

    public Car(String name, int doors, int gears, boolean isManual, String type, int seats) {
        super(name);
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.wheels = 4; // standard for cars
        this.currentGear = 1;
    }

    public void changeGear(int gear) {
        if (gear >= 1 && gear <= gears) {
            this.currentGear = gear;
        }
    }

    public void changeSpeed(int speed, int direction) {
        move(speed, direction);
    }

    // Getters for tests
    public int getDoors() { return doors; }
    public int getGears() { return gears; }
    public boolean isManual() { return isManual; }
    public int getCurrentGear() { return currentGear; }
    public String getType() { return type; }
    public int getSeats() { return seats; }
    public int getWheels() { return wheels; }
}
