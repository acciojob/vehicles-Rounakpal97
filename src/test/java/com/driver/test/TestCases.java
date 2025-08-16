package com.driver.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.driver.*;

public class TestCases {

    @Test
    public void testCar1() {
        Car car = new Car(4, 4, 6, 5, true, "Sedan");

        assertEquals(4, car.getDoors());
        assertEquals(6, car.getGears());
        assertEquals(4, car.getWheels());
        assertTrue(car.isManual());
        assertEquals("Sedan", car.getType());
        assertEquals(5, car.getSeats());
    }

    @Test
    public void testF11() {
        F1 f1 = new F1(4, 0, 8, 1, false, "Formula");
        f1.changeGear(1);
        f1.move(100, 30);
        f1.steer(75);
        f1.stop();

        assertFalse(f1.isManual());
    }

    @Test
    public void testF12() {
        F1 f1 = new F1(4, 0, 8, 1, false, "Formula");
        f1.changeGear(3);
        f1.move(120, 45);
        f1.steer(60);
        f1.stop();

        assertEquals(8, f1.getGears());
    }

    @Test
    public void testBoat() {
        Boat boat = new Boat(10, "Blue");
        assertEquals(10, boat.getCapacity());
        assertEquals("Blue", boat.getColor());
    }

    @Test
    public void testVehicleMove() {
        Vehicle vehicle = new Vehicle();
        vehicle.move(20, 30);
        vehicle.steer(90);
        vehicle.stop();
    }

    @Test
    public void testCarGearChange() {
        Car car = new Car(4, 4, 6, 5, true, "Sedan");
        car.changeGear(2);
        car.changeGear(3);
        car.changeGear(4);
    }
}
