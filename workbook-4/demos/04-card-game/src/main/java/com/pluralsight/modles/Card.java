package com.pluralsight.modles;

import java.util.Collections;

public class Card {
    private String suit;
    private String faceValue;


    //we can determine pont value pased on faceValue
    //private int pointValue;


    public Card(String suit, String faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public String getSuit() {
        return suit;
    }

    public String getFaceValue() {
        return faceValue;
    }

    //derived
    public int getPointValue(){
        switch(faceValue){
            case "A":
            return  11;
            case "K":
                return 10;
            case "Q":
                return 10;
            case "J":
                return 10;
            default: Integer.parseInt(faceValue);
        }
    }


    public String getColor(){
        switch (suit.toLowerCase()){
            case "hearts":
            case "diamonds":
                return "Red";
            default:
                return "Black";

        }

    }


    public void shuffle(){
        Collections.shuffle(Card);
    }
}
