package com.klef.jfds.exam;

import jakarta.persistence.Entity;

@Entity
public class Truck extends Vehicle {
    private int loadCapacity;

    public int getLoadCapacity() { return loadCapacity; }
    public void setLoadCapacity(int loadCapacity) { this.loadCapacity = loadCapacity; }
}