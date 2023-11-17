package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarRepoTest {

    @Test
    void getCarById_shouldThrowCarNotFoundException_WhenInvalidIdIsGiven() {
        //GIVEN
        CarRepo repo = new CarRepo();
        //WHEN
        //THEN
        try {
            repo.getCarById("1");
            fail();
        }catch (CarNotFoundException e){
            assertTrue(true);
        }
    }


}