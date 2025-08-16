package com.driver;

public class Main {
    public static void main(String[] args) {

        // ---------- Test Vehicle ----------
        Vehicle v = new Vehicle("Generic Vehicle");
        v.move(30, 45);
        v.steer(15);
        v.stop();
        System.out.println("Vehicle name: " + v.getName());
        System.out.println("Current Speed: " + v.getCurrentSpeed());
        System.out.println("Current Direction: " + v.getCurrentDirection());

        System.out.println("-----------------------------");

        // ---------- Test Car ----------
        Car car = new Car("Sedan", 4, 4, 5, true, "Petrol", 5);
        car.changeGear(2);
        car.changeSpeed(60, 90);

        System.out.println("-----------------------------");

        // ---------- Test F1 ----------
        F1 ferrari = new F1("Ferrari", true);
        ferrari.move(50, 0);
        ferrari.accelerate(60);   // increase speed and change gear
        ferrari.accelerate(200);  // push to higher gear
        ferrari.accelerate(-100); // slow down

        System.out.println("-----------------------------");

        // ---------- Test Boat ----------
        Boat yacht = new Boat("Yacht", 40);
        System.out.println("Boat Name: " + yacht.getVehicleName());
        System.out.println("Boat Capacity: " + yacht.getVehicleCapacity());

        Boat fishingBoat = new Boat("Fishing Boat", 10);
        System.out.println("Boat Name: " + fishingBoat.getVehicleName());
        System.out.println("Boat Capacity: " + fishingBoat.getVehicleCapacity());
    }
}
