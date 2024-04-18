package com.pluralsight;
// import Scanner
import java.util.Scanner;


public class Main {
    //make it equal to what the user puts in
    private final static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args)
    {
        CellPhone phone1 = register();
        System.out.println("Serial number;" + phone1.getSerialNumber());
        System.out.println("Model number;" + phone1.getModel());
        System.out.println("Carrier; " + phone1.getCarrier());
        System.out.println("Phone number;" + phone1.getPhoneNumber());
        System.out.println("Owner;" + phone1.getOwner());

        CellPhone phone2 = register();

    }
    public static CellPhone register (){
        //String name = "Gregor";

        CellPhone phone = new CellPhone();

        System.out.println("What is serial number?");
        int serialNumber = userInput.nextInt();
        userInput.nextLine();
        phone.setSerialNumber(serialNumber);

        System.out.println("What is model number");
        String model = userInput.nextLine();
        phone.setModel(model);

        System.out.println("Who is the carrier");
        String carrier = userInput.nextLine();
        phone.setCarrier(carrier);


        System.out.println("What is the phone number");
        String phoneNumber = userInput.nextLine();
        phone.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the Phone");
        String owner = userInput.nextLine();
        phone.setOwner(owner);





     return phone;
    }

    //get name first and last



    // get model

    // get carrier

    // get phoneNumber

    // get owner










}