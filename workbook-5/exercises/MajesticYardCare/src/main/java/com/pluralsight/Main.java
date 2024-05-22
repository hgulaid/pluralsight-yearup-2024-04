package com.pluralsight;

import com.pluralsight.models.Shape;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Shape> shapes = new ArrayList<>();

        // load all shapes into the arraylist
    try(Scanner scanner = new Scanner(new File("data/shapes.csv")))
    {
        while(scanner.hasNextLine())
        {
            String line =
        }
    }


        // then print the toString() of each shape
        for (Shape shape: shapes)
        {
            System.out.println(shape);
        }
    }
}