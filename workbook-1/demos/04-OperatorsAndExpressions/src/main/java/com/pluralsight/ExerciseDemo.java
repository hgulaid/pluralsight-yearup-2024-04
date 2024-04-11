package com.pluralsight;

public class ExerciseDemo
{
    public static void main(String[] args)
    {
        question1();
        question2();
    }

    public static void question1()
    {
        // calculate the amount of change given after buying chocolate
        // chocolate cost 2.99 per bar float costChocolate =
        //I have 20 dollars
        // buy 4 bars of chocolate
        // how much change will I get back?

        // declare your variables
        double balance = 20;
        double priceOfChocolate = 2.99;
        int quantityBought = 4;
        double totalCost;
        double changeGiven;

        // write logic
        totalCost = priceOfChocolate * quantityBought;
        changeGiven = balance - totalCost;

        //output
        System.out.println("Chocolate Bar: $ " + priceOfChocolate);
        System.out.println("");
        System.out.println();
        System.out.println();
        System.out.println();


    }

    public static void question2()
    {
        // calculate the parameter of a circle
        // for a circle with a radius of 12

        //variables
        double radius = 12;
        double perimeter;

        perimeter = 2 * Math.PI * radius;


        // output

    }

}

