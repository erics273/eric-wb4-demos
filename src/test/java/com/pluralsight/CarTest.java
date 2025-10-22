package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void accelerate_shouldincrease_speed(){
        //arrange
        Car myCar = new Car("Ford", "Explorer");

        //act
        myCar.accelerate(10);

        //assert
        assertEquals(myCar.getSpeed(), 10);
    }

}