package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTests {
    @Test
    public void accelerate_Should_IncreaseTheSpeedOfTheCar_WhenItAcceleratesTwice() {
        //arrange = our setup what do we need to test correctly What do we need before testing accelerate method.
        Car car = new Car("Ford", "Mustang");

        int increaseBy = 20;
        int expectedSpeed = 20;

        // act What's the action we are doing -----> THE ONE action we are testing
        car.accelerate(increaseBy);


        // assert ----> Verify that the action worked as expected

        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed,actualSpeed, "Because the car started at 0, and increased the speed by 10 TWICE");

    }

    @Test
    public void accelerate_ShouldNot_changeSpeed_withNegativeInputs(){
        //arrange
        Car car = new Car ("Ford", "Mustang");
        int increaseBy = -20;
        int expectedSpeed = 0;



        //act
        car.accelerate(increaseBy);



        // assert
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed, actualSpeed, "Because a car cannot accelerate a negative speed");


    }

}