package com.pluralsight;


import java.util.Scanner;

public class SandWichShop {

    public static void main(String[] args) {
    Scanner UserInput = new Scanner(System.in);

    final String regSandWhich = "Regular Sandwich";
    final double priceRegular = 5.45;
    final String largeSandwich = "Large Sandwich";
    final double priceLarge = 8.95;
    final boolean Student;
    int customerChoice;
    int kindOfSandwiches;
    double totalPrice;
    int age;
    double discount;

    // welcome user & show menu
    System.out.printf("Hello, welcome in take a look at our menu\n");
    System.out.printf("1.) %s - $ %.2f\n", regSandWhich,priceRegular);
    System.out.printf("2.) %s   - $ %.2f\n", largeSandwich,priceLarge);
    System.out.println();
    // Prompt user to pick an item and ask their age
    System.out.print("What size sandwich would you like?\n");
    kindOfSandwiches = UserInput.nextInt();
    System.out.print("How old are?\n");
    age = UserInput.nextInt();

    // Calculate discount
    if (age <= 17) {

        discount = .10;

    }else if(age >= 65) {

        discount = .20;

    }else{
        discount = 0;
    }
//calculate price of sandwich with discount.
    if (kindOfSandwiches == 1 ) {

        totalPrice = priceRegular - (priceRegular * discount);

    }
    else if (kindOfSandwiches == 2) {

        totalPrice = priceLarge - (priceLarge * discount) ;

    } else{

        System.out.print("You have made a Poor Selection");
        return;

    }

    System.out.printf("Your total price is $ %.2f \n", totalPrice);
    System.out.print("Thank you for shopping with us!");

    }
}