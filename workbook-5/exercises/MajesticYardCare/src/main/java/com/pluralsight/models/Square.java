package com.pluralsight.models;

public class Square extends Rectangle
{
   // private int height;
    public Square(int sideLength)
    {
        super("Square", sideLength, sideLength);
    }

    @Override
    public double getArea()
    {
        return Math.sqrt(getHeight());
    }
}
