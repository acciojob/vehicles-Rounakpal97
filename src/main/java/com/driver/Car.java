// Car.java
package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private int seats;
    private boolean isManual;
    private int currentGear;
    private String type;

    public Car(int wheels, int doors, int gears, int seats, boolean isManual, String type) {
        super();
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.seats = seats;
        this.isManual = isManual;
        this.type = type;
        this.currentGear = 1;
    }

    public int getWheels() { return wheels; }
    public int getDoors() { return doors; }
    public int getGears() { return gears; }
    public int getSeats() { return seats; }
    public boolean isManual() { return isManual; }
    public String getType() { return type; }

    public void changeGear(int gear) {
        this.currentGear = gear;
        System.out.println("changeGear method called - The gear is changed to: " + gear);
    }
}
