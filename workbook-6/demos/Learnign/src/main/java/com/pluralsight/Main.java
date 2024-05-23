package com.pluralsight;

public class Main {
    public static void main(String[] args)
    {
// point this to either of these classes
   // Series ob;

    ByTwos byTwos = new ByTwos();
//    ByThrees byThrees = new ByThrees();
//    for (int i = 0; i < 6; i++){
//        ob = byTwos;
//        System.out.println("ByTwos: " + ob.getNext());
//
//        ob = byThrees;
//        System.out.println("ByThrees: " + ob.getNext());
//
//
//
//        // ob knows that it's calling getNext, but it also checks what object it's
//        //calling it on. and it'll call that objects version of it
//        // can only call what's inside the interface not what's defined in a class
//
//    }
    byTwos.printStuff();


    // we get access to this because it's implemented withing the series interface

    }
}