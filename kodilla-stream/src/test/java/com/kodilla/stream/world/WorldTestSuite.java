package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        Continent europe = new Continent();
        europe.addCountry(new Country("Poland", new BigDecimal("37950000")));
        europe.addCountry(new Country("Germany", new BigDecimal("83240000")));
        europe.addCountry(new Country("Germany", new BigDecimal("67390000")));

        Continent america = new Continent();
        america.addCountry(new Country("USA", new BigDecimal("329500000")));
        america.addCountry(new Country("Canada", new BigDecimal("38010000")));

        Continent asia = new Continent();
        asia.addCountry(new Country("China", new BigDecimal("1402000000")));
        asia.addCountry(new Country("Japan", new BigDecimal("125800000")));

        World world = new World();
        world.addContinent(europe);
        world.addContinent(america);
        world.addContinent(asia);

        //When
        BigDecimal result = world.getPeopleQuantity();
        BigDecimal expectedResult = new BigDecimal("2083890000");

        //Then
        assertEquals(expectedResult,result);
    }

}
