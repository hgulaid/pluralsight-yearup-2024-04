package com.pluralsight;

public class Hovercraft extends Vehicle{

    private boolean floats;
    private int maxSpeed;


    public Hovercraft(String color, int numberOfPassenger, int cargoCapacity, int fuelCapacity, boolean floats, int maxSpeed) {
        super(color, numberOfPassenger, cargoCapacity, fuelCapacity);
        this.floats = floats;
        this.maxSpeed = maxSpeed;
    }



    public boolean isFloats() {
        return floats;
    }

    public void setFloats(boolean floats) {
        this.floats = floats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }










}
