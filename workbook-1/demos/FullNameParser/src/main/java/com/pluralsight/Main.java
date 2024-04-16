package com.pluralsight;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
Scanner userInput = new Scanner(System.in);

String fullName;


    System.out.println("What's your full Name?");
    fullName = userInput.nextLine().strip();
    //System.out.println(fullName.trim());

    String firstName = "";
    String middleName = "";
    String lastName = "";

    //if (fullName) {
     //   }

String[] nameParts  = fullName.split(" ");

firstName = nameParts[0];
boolean hasMiddleName = nameParts.length >2;
if (hasMiddleName){
    middleName = nameParts[1];
    lastName = nameParts[2];
} else{
    lastName = nameParts[1];
    middleName = "(none)";
}
System.out.println();
System.out.printf("First name: %s\n", firstName);
System.out.printf("Middle name: %s\n", middleName);
System.out.printf("Last name: %s", lastName);



    //if fullName has 3 words
        // show first middle and last name
        // if it only has 2 words return first and last name






        //System.out.println("Hello world!");
    }
}