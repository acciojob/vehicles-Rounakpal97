// Boat.java
package com.driver;

public class Boat extends Vehicle {
    private int capacity;
    private String color;

    public Boat(int capacity, String color) {
        super();
        this.capacity = capacity;
        this.color = color;
    }

    public int getCapacity() { return capacity; }
    public String getColor() { return color; }
}
