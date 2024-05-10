package com.pluralsight;

public class Reservation {
    private final double kingPrice = 139.00;
    private final double doublePrice = 124.00;

    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights,boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

//price per night
    public double getPrice() {
        if (isWeekend){
            if (roomType.equalsIgnoreCase("King")){
                return kingPrice * .10 + kingPrice;
            }else {
                return doublePrice * .10 + doublePrice;
            }
        }else{
            if (roomType.equalsIgnoreCase("King")){
                return 139;
            }else {
                return 124;
            }
        }
    }

    public double totalPrice(){
        return getPrice() * getNumberOfNights();
    }

    public String getRoomType(){return roomType;}
    public void setRoomType(String roomType){this.roomType = roomType;}

    public int getNumberOfNights(){return numberOfNights;}
    public void setWeekend(int numberOfNights){this.numberOfNights = numberOfNights;}

    public boolean getIsWeekend(){return isWeekend;}
    public void setWeekend(boolean isWeekend){this.isWeekend = isWeekend;}

    //derived


}
