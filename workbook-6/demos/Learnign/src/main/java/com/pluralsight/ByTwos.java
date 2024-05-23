package com.pluralsight;

public class ByTwos  implements Series
{
    int val;

    ByTwos(){
         val = 0;
    }

    public int getNext()
    {
     if (val >= MAX)
     {
         System.out.println(ERRORMSG);
     }
    val += 2;
    return val;
    }

    public int getPrev()
    {
        val -= 2;
        return val;
    }


//this overrides the original one in the series interface
//    public void printStuff(){
//        System.out.println("I am by twos class");
//    }
}
