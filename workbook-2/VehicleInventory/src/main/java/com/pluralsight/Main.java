package com.pluralsight;

import java.util.Scanner;

public class Main {
    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        // create an array of vehicles here

        Vehicle[] vehicles = {
                new Vehicle(3888212, "Nissan GTR", "red", 10000, 53399.20),
                new Vehicle(3444834, "Honda Accord", "blue", 11000, 26599.0),
                new Vehicle(3888256, "Dodge Hellcat", "green", 12000, 87999.0),
                new Vehicle(3888278, "Toyota Camry", "yellow", 14000, 25390.0),
                new Vehicle(3888289, "Kia Soul", "black", 14000, 20500.00),
                new Vehicle(3888201, "Lincoln Navigator", "white", 15000, 70399.00)
        };
        int choice = 0;
        while (choice != 6) {
            // print the home screen
            System.out.println();
            System.out.println("What do you want to do?");
            System.out.println();
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.println();
            System.out.println("Enter your command");
            choice = Integer.parseInt(userInput.nextLine());

            switch (choice) {
                case 1:
                    // call the list all vehicles (pass the array)
                    listAllVehicles(vehicles);

                    break;
                case 2:
                    // call the search by make/model
                    searchByMakeModel(vehicles);
                    break;
                case 3:
                    // call the search by price
                    searchByPrice(vehicles);
                    break;
                case 4:
                    // call the search by color
                    searchByColor(vehicles);
                    break;
                case 5:
                    // add a vehicle
                    break;
                case 6:
                    System.out.println();
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid selection");
                    break;
            }

        }


    }

     public static void listAllVehicles(Vehicle[]vehicles){
        // loop through vehicles and print all

        for (int i = 0; i < vehicles.length; i++) {


            System.out.printf("VehicleID: %d\nMake/model: %s\nColor: %s\nMiles: %d\nPrice: %.2f\n\n", vehicles[i].getVehicleId(), vehicles[i].getMakeModel(), vehicles[i].getColor(), vehicles[i].getOdometerReading(), vehicles[i].getPrice());
            //(vehicles[i].getVehicleId(), vehicles[i].getMakeModel());
        }
    }

    public static void searchByMakeModel(Vehicle[] vehicles) {
        // get user search criteria
        System.out.println();
        System.out.print("Search cars by make and model\n");
        System.out.print("Enter make and model: ");
        String searchMakeModel = userInput.nextLine();

        // loop through vehicles and print only vehicles that match the search
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getMakeModel().equalsIgnoreCase(searchMakeModel)) {
                System.out.printf("This is the car you searched by make and model:\nVehicleID: %d\nMake/model: %s\nColor: %s\nMiles: %d\nPrice: %.2f\n", vehicles[i].getVehicleId(), vehicles[i].getMakeModel(), vehicles[i].getColor(), vehicles[i].getOdometerReading(), vehicles[i].getPrice());
            }//else{
                //System.out.print("Sorry we don't have that in our inventory");
                //break;
            //}
        }
    }

    public static void searchByPrice(Vehicle[] vehicles) {
        // get user search criteria
        System.out.println();
        System.out.print("Search vehicles by price\n");
        System.out.print("Enter price of the car you are looking for: ");
        double searchPrice = userInput.nextDouble();
        userInput.nextLine();
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getPrice() == searchPrice) {
                System.out.printf("This is the car you searched by price:\nVehicleID: %d\nMake/model: %s\nColor: %s\nMiles: %d\nPrice: %.2f\n", vehicles[i].getVehicleId(), vehicles[i].getMakeModel(), vehicles[i].getColor(), vehicles[i].getOdometerReading(), vehicles[i].getPrice());
            }else{
                System.out.print("Sorry we don't have that in our inventory");
                break;
            }
        }

        // loop through vehicles and print only vehicles that match the search
    }

    public static void searchByColor(Vehicle[] vehicles) {
        // get user search criteria

        // loop through vehicles and print only vehicles that match the search
        System.out.println();
        System.out.print("Search vehicles by color\n");
        System.out.print("Enter color is the car you are looking for: ");
        String searchColor = userInput.nextLine();
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getColor().equalsIgnoreCase(searchColor)) {
                System.out.printf("This is the car you searched by price:\nVehicleID: %d\nMake/model: %s\nColor: %s\nMiles: %d\nPrice: %.2f\n", vehicles[i].getVehicleId(), vehicles[i].getMakeModel(), vehicles[i].getColor(), vehicles[i].getOdometerReading(), vehicles[i].getPrice());

            }else{
                System.out.print("Sorry we don't have that in our inventory");
                break;
            }
        }
    }

    //bonus(optional)

    public static Vehicle addVehicle(Vehicle[] vehicles) {
        // get user input
        //System.out.print("Add vehicle");
        //System.out.println("What vehicle would you like to add?");
       // String [] addCar = new String[]{userInput.nextLine()};
        // create a vehicle
        //Vehicle [] tempArray = new Vehicle[vehicles.length+1];

        // add it to the inventory
        //System.arraycopy();

        // hint: you will need to create a new array that is 1 bigger than the old one
        //       then add the new vehicle in the last spot
        return null;
    }
}