package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void isAdult_returnsFalse_under18() {
        //arrange
        Person thePerson = new Person("Eric", 17);

        //act
        boolean isNotAdult = thePerson.isAdult();

        //assert
        assertFalse(isNotAdult);
    }

    @Test
    public void isAdult_returnsTrue_over18() {
        //arrange
        Person thePerson = new Person("Eric", 20);

        //act
        boolean isNotAdult = thePerson.isAdult();

        //assert
        assertTrue(isNotAdult);
    }

}