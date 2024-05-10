package com.pluralsight.modles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    public void getColor_shouldReturnRed_forHearts()
    {
        //arrange
        Card card = new Card("Hearts", "Q");

        //act
        String color = card.getColor();

        //assert
        String expectedColor = "Red";
        assertEquals(expectedColor,color,"Because card is a Queen of Hearts");
    }

    @Test
    public void getPoint_shouldReturn1_forHearts()
    {
        //arrange
        Card card = new Card("Hearts", "Q");

        //act
        String color = card.getColor();

        //assert
        String expectedColor = "Red";
        assertEquals(expectedColor,color,"Because card is a Queen of Hearts");
    }





}