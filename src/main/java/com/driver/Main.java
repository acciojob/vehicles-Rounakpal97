package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 f1 = new F1("Ferrari", true);
        f1.accelerate(120);

        Boat boat = new Boat("Yacht", 50);

        System.out.println("Car: " + f1.getName() + ", Speed: " + f1.getCurrentSpeed() + ", Gear: " + f1.getCurrentGear());
        System.out.println("Boat: " + boat.getVehicleName() + ", Capacity: " + boat.getVehicleCapacity());
    }
}
