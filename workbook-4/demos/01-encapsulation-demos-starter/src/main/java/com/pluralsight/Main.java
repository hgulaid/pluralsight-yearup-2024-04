package com.pluralsight;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person ("John", "Doe", 25);
        System.out.println(person.getFirstName() + " " + person.getLastName());


        Order donuts = new Order("Gregor","donut",4.50, 3);
        System.out.println(donuts.getTotalPrice());
    }
}