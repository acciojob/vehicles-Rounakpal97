// Main.java
package com.driver;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, 4, 6, 5, true, "Sedan");
        car.changeGear(1);
        car.move(50, 0);
        car.steer(90);
        car.stop();

        F1 f1 = new F1(4, 0, 8, 1, false, "Formula");
        f1.changeGear(1);
        f1.move(100, 30);
        f1.steer(75);
        f1.stop();

        Boat boat = new Boat(10, "Blue");
        boat.move(20, 45);
        boat.steer(90);
        boat.stop();
    }
}
