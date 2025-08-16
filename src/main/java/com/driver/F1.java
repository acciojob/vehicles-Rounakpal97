package com.driver;

public class F1 extends Car {
    public F1(String name, boolean isManual) {
        super(name, 4, 2, 6, isManual, "F1", 1); // arbitrary values for unspecified parameters
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;
        if(newSpeed < 0) newSpeed = 0;

        int gear = 1;
        if(newSpeed == 0) gear = 1;
        else if(newSpeed <= 50) gear = 1;
        else if(newSpeed <= 100) gear = 2;
        else if(newSpeed <= 150) gear = 3;
        else if(newSpeed <= 200) gear = 4;
        else if(newSpeed <= 250) gear = 5;
        else gear = 6;

        changeGear(gear);

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
