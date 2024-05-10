package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Room room = new Room(2, 150.00, true, true);
        room.checkIn();
        room.cleanRoom();
        room.checkOut();
        System.out.println(room.getOccupied());

        Reservation reservation  =  new Reservation("King",5,false);

        System.out.println(reservation.totalPrice());

        Employee employee = new Employee(33,45);

        System.out.println(employee.totalPay());
    }




}