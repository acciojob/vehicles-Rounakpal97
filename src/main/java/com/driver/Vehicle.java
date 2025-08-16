// Vehicle.java
package com.driver;

public class Vehicle {
    private int speed;
    private int direction;

    public Vehicle() {
        this.speed = 0;
        this.direction = 0;
    }

    public void changeSpeed(int speed, int direction) {
        this.speed = speed;
        this.direction = direction;
        System.out.println("changeSpeed method called - The speed is changed to: " + speed + ", and the direction is changed to: " + direction + " degrees");
    }

    public void move(int speed, int direction) {
        changeSpeed(speed, direction);
        System.out.println("move method called - The speed is changed to: " + speed + ", and the direction is changed to: " + direction + " degrees");
    }

    public void steer(int direction) {
        this.direction = direction;
        System.out.println("steer method called - The direction is changed to: " + direction + " degrees");
    }

    public void stop() {
        this.speed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }
}
