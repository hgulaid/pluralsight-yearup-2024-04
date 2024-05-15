package com.pluralsight;

public class SemiTruck extends Vehicle{

    private int numberOfDoors;
    private boolean trailer;

    public SemiTruck(String color, int numberOfPassenger, int cargoCapacity, int fuelCapacity, int numberOfDoors, boolean trailer ) {
        super(color, numberOfPassenger, cargoCapacity, fuelCapacity);
        this.numberOfDoors = numberOfDoors;
        this. trailer = trailer;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isTrailer() {
        return trailer;
    }

    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }
}
