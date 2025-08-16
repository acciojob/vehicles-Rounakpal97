package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("Mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        Boat titanic = new Boat("Titanic", 2000);
        System.out.println(titanic.getVehicleName());
        System.out.println(titanic.getVehicleCapacity());
    }
}
