package com.pluralsight;

public class Car extends Vehicle
{

private int numberOfDoors;
private boolean sunRoof;


    public Car(String color, int numberOfPassenger, int cargoCapacity, int fuelCapacity, int numberOfDoors, boolean sunRoof) {
        super(color, numberOfPassenger, cargoCapacity, fuelCapacity);
        this.numberOfDoors = numberOfDoors;
        this.sunRoof = sunRoof;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }
}
