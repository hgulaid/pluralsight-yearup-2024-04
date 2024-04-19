package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        Dice dice = new Dice();

        int roll1;
        int roll2;
        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;


        for(int i = 0; i < 20; i++)
        {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            System.out.printf("roll %d: %d - %d Sum : %d\n", i+1, roll1, roll2, sum);
        if(sum==2){
            count2++;
        } if (sum==4){
            count4++;
        } if (sum == 6){
            count6++;
        }if (sum == 7){
            count7++;
        }
        }
        System.out.printf("2 counter: %d\n4 counter: %d\n6 counter: %d\n7 counter: %d ", count2, count4, count6, count7);


    }
}