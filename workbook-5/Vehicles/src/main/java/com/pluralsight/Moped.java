package com.pluralsight;

public class Moped extends Vehicle{



    private boolean splitLane;
    private int maxSpeed;
    private int numberOfHelmets;

    public Moped(String color, int numberOfPassenger, int cargoCapacity, int fuelCapacity, boolean spitLane, int maxSpeed, int numberOfHelmets) {
        super(color, numberOfPassenger, cargoCapacity, fuelCapacity);
        this.splitLane = spitLane;
        this.maxSpeed = maxSpeed;
        this.numberOfHelmets = numberOfHelmets;
    }


    public boolean isSplitLane() {
        return splitLane;
    }

    public void setSplitLane(boolean splitLane) {
        this.splitLane = splitLane;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumberOfHelmets() {
        return numberOfHelmets;
    }

    public void setNumberOfHelmets(int numberOfHelmets) {
        this.numberOfHelmets = numberOfHelmets;
    }
}
