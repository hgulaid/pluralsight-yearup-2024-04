package com.pluralsight;

import java .util.Scanner;

public class Main {
    public static void main(String[] args) {
    // prompts user to enter their name
    //String employeeName;
    double hoursWorked;
    double payRate;
    double gross;
    Scanner Input = new Scanner (System.in);
    System.out.println("Please enter your name: ");
    String employeeName = Input.nextLine();


    // prompt user to enter hours worked (floating number)
    System.out.printf("Hello %s how many hours have you worked?\n", employeeName);
    //System.out.print("Hello %s how many hours have you worked?", employeeName);
    hoursWorked = Input.nextDouble();

    //prompt user to enter their pay rate (floating number)
    System.out.print("What's your pay rate?\n");
    payRate = Input.nextDouble();


    //Calculate gross pay
    gross = hoursWorked * payRate;
    System.out.printf("Your gross pay is %.2f ", gross);


    }
}