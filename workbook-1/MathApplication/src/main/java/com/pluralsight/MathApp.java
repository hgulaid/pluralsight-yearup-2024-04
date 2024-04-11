package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // find all 7 questions in your workbook on page 
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();

    }

    // write ONLY code for QUESTION 1 in this function
    public static void question1() {
        // Question 1:
        // declare variables here
        double bobSalary = 50000;
        double garySalary = 59332;
        double highestSalary;


        // code the logic to the problem here
        highestSalary = Math.max(bobSalary, garySalary);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Higher salary is " + highestSalary);
    }


    // write ONLY code for QUESTION 2 in this function
    public static void question2() {
        // Question 2:
        // declare variables here
        // variable are carPrice and truckPrice
        double carPrice = 4589.88;
        double truckPrice = 7999.33;
        double cheaperPrice;


        // code the logic to the problem here
        cheaperPrice = Math.min(carPrice, truckPrice);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The cheaper price is " + cheaperPrice);
    }


    // write ONLY code for QUESTION 3 in this function
    public static void question3() {
        // Question 3:
        // declare variables here
        double radius = 7.25;
        double area;


        // code the logic to the problem here
        area = Math.PI * (radius * radius);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Area is " + area);
    }


    // write ONLY code for QUESTION 4 in this function
    public static void question4() {
        // Question 4:
        // declare variables here
        double number = 5.0;
        double squareRoot;

        // code the logic to the problem here
        squareRoot = Math.sqrt(number);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println(squareRoot);
    }


    // write ONLY code for QUESTION 5 in this function
    public static void question5() {
        // Question 5:
        // declare variables here
        int x1 = 5;
        int x2 = 85;
        int y1 = 10;
        int y2 = 50;
        int width;
        int height;
        double dis;


        // code the logic to the problem here
        width = x2 - x1;
        height = y2 - y1;
        dis = Math.pow(width, 2) + Math.pow(height, 2);
        dis = Math.sqrt(dis);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Distance between these two points is " + dis);
    }


    // write ONLY code for QUESTION 6 in this function
    public static void question6() {
        // Question 6:
        // declare variables here
        double number = -3.8;
        double absoluteValue;


        // code the logic to the problem here
        absoluteValue = Math.abs(number);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Absolute value of " + number + " is " + absoluteValue);
    }


    // write ONLY code for QUESTION 7 in this function
    public static void question7() {
        // Question 7:
        // declare variables here
        double randomNumber;

        // code the logic to the problem here
        randomNumber = Math.random()*50-100;

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The answer is " + randomNumber);
    }
}