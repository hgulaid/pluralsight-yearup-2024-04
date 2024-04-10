package com.pluralsight;

import java.util.zip.ZipEntry;

public class Main
{
    public static void main(String[] args)
    {
        // declare variables for each of the following:


        // a vehicle identification number in the range 1000000 - 9999999
        int vehicleIdentificationNumber = 435255444;
        System.out.println(vehicleIdentificationNumber);

        // a vehicle make /model (i.e. Ford Explorer)
        String vehicleMake = "Dodge Hellcat";
        System.out.println(vehicleMake);

        // a vehicle color
        String vehicleColor = "Red";
        System.out.println("Vehicle color: " + vehicleColor);


        // whether the vehicle has a towing package
        boolean hasTowPackage = true;
        System.out.println("Does the car have a tow package? " + hasTowPackage);

        // an odometer reading
        int odometerReading = 43444;
        System.out.println("Odometer reading: " + odometerReading);

        // a price
        double vehiclePrice = 40999.87;
        System.out.println("Vehicle price: " + vehiclePrice);

        // a quality rating (A, B, or C)
        char carQuality = 'A';
        System.out.println("Car quality: " + carQuality);

        // a phone number
        String phoneNumber = "(415)888-4353";
        // since you're not calculating phone numbers you can make it a string
        System.out.println("Phone number: " + phoneNumber);

        // a social security number
        int socialSecurity = 321574323;
        // no need to make this an integer because we're never going to calculate SSN
        System.out.println("SSN:" + socialSecurity);

        // a zip code
        int zipCode = 94610;
        System.out.println("Zip code: " + zipCode);



    }
}