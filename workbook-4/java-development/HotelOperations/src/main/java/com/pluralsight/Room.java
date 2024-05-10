package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room (int getNumberOfBeds, double getPrice, boolean isOccupied, boolean isDirty){

        this.numberOfBeds = getNumberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;

    }
//getters and setters
    public int getGetNumberOfBeds() {return numberOfBeds;}
    public void setGetNumberOfBeds(int getNumberOfBeds) {
        this.numberOfBeds = getNumberOfBeds;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public boolean getOccupied(){
        return isOccupied;
    }
    public void setOccupied(boolean isOccupied){
        this.isOccupied = isOccupied;
    }
    public boolean getDirty(){
        return isDirty;
    }
    public void setDirty(boolean isDirty){
        this.isDirty = isDirty;
    }


    public boolean isAvailable() {
        return !isDirty && !isOccupied;
   }

   public void checkIn() {
       this.isOccupied = true;
       this.isDirty = true;
       }

   public void checkOut(){
        this.isOccupied = false;
   }

   public void cleanRoom(){
        this.isDirty = false;

   }

   }

