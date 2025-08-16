// F1.java
package com.driver;

public class F1 extends Car {
    public F1(int wheels, int doors, int gears, int seats, boolean isManual, String type) {
        super(wheels, doors, gears, seats, isManual, type);
    }

    @Override
    public boolean isManual() {
        return super.isManual();
    }

    @Override
    public void changeGear(int gear) {
        super.changeGear(gear);
    }

    @Override
    public void move(int speed, int direction) {
        super.move(speed, direction);
    }
}
