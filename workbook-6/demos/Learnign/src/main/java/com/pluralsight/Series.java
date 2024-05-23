package com.pluralsight;

public interface Series {

    int MAX = 10;
    String ERRORMSG = "Cannot go above value: " + MAX;


    int getNext();

    default void printStuff()
    {
        System.out.println("Live from New York it's Saturday night");
        printMoreStuff();
    }

    private void printMoreStuff(){
        System.out.println("more stuff");
    }

}
    // interface tells us what has to be implemented
    // but the class decides how to implement it


/*
-interface reference variables: you can create a variable of the
-interface type and have it reference objects that implement that interface
-All variables declared in interfaces are
public(because any class that implements it has access to the variable)
 static( because we can call it without using an object series.Max) and
 final(because we cant change the value of it)
-Interfaces can also be extended
- default methods: allows for stuff to go in to the body??

 */

