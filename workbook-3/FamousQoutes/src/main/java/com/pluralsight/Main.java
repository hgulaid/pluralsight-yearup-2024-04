package com.pluralsight;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] quotes = {
                "\"The only way to do great work is to love what you do.\" - Steve Jobs",
                "\"The greatest glory in living lies not in never falling, but in rising every time we fall.\" - Nelson Mandela",
                "\"The way to get started is to quit talking and begin doing.\" - Walt Disney",
                "\"Your time is limited, don't waste it living someone else's life.\" - Steve Jobs",
                "\"If life were predictable it would cease to be life, and be without flavor.\" - Eleanor Roosevelt",
                "\"Life is what happens when you're busy making other plans.\" - John Lennon",
                "\"The future belongs to those who believe in the beauty of their dreams.\" - Eleanor Roosevelt",
                "\"The only limit to our realization of tomorrow will be our doubts of today.\" - Franklin D. Roosevelt",
                "\"It is during our darkest moments that we must focus to see the light.\" - Aristotle",
                "\"Don't judge each day by the harvest you reap but by the seeds that you plant.\" - Robert Louis Stevenson"


        };
        int index =1;
        while (index != 0 ) {
            try {
                System.out.println("Pick a quote from 1-10");
                index = scanner.nextInt();
                index--;
                //System.out.println(quotes[index]);
                if (index != 0) {
                    System.out.print(quotes[index-1]);
                }
            } catch (Exception ex) {
                System.out.println("Invalid please enter a number between 1-10");
            } catch(NumberFormatException e){
                System.out.println("Invalid please enter a number between 1-10");

            }
        }
    }


}


// fucntions version
// public static int gerUserSelection


// public static void
