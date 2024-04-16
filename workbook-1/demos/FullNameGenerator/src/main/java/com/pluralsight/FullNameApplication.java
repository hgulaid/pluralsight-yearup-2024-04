package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
    // variables
    String firstName;
    String lastName;
    String middleName;
    String suffix;


    // prompt user to enter parts of their name
    System.out.printf("What is your first name?\n");
    firstName = userInput.nextLine();
    // middle name
    System.out.printf("What is your middle Name?\n");
    middleName = userInput.nextLine();
    //last name
    System.out.print("What is your last name?\n");
    lastName = userInput.nextLine();
    // suffix
    System.out.print("What is your suffix?");
    suffix = userInput.nextLine();
    String fullName; // firstName + middleName + "." + lastName + suffix;

//    //if the use has a middle name return first name last name and
//        if (middleName.isEmpty()) {
//            System.out.printf("%s %s, %s", firstName, lastName, suffix);
//        } else {
//            System.out.printf("%s %s. %s, %s", firstName, middleName, lastName, suffix);
//        }
//        if (suffix.isEmpty()) {
//            System.out.printf("%s %s. %s", firstName, middleName, lastName);
//        }else{
//            System.out.printf("%s %s. %s, %s", firstName, middleName, lastName, suffix);
//        }
//        if (middleName.isEmpty() && suffix.isEmpty()){
//            //fullName= fullName.replace("   "," ");
//            System.out.printf("%s, %s", firstName, lastName);
//        }


        if (middleName.isEmpty() && suffix.isEmpty()){
            //fullName= fullName.replace("   "," ");
            System.out.printf("%s %s", firstName, lastName);
        }
        else if (middleName.isEmpty()) {
            System.out.printf("%s %s, %s", firstName, lastName, suffix);
        }
        else if (suffix.isEmpty()) {
            System.out.printf("%s %s. %s", firstName, middleName, lastName);
        }
        else {
            System.out.printf("%s %s. %s, %s", firstName, middleName, lastName, suffix);
        }

        //System.out.printf("%s %s %s %s",firstName, middleName, lastName, suffix);























        //System.out.println("Hello world!");
    }
}