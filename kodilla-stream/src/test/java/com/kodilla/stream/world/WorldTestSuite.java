package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        world.addContinent(new Continent(new Country("Poland", new BigDecimal("123456789")), "Europe"));
        world.addContinent(new Continent(new Country("Great Britain", new BigDecimal("123456789")), "Europe"));
        world.addContinent(new Continent(new Country("Croatia", new BigDecimal("123456789")), "Europe"));
        world.addContinent(new Continent(new Country("Brazil", new BigDecimal("987654321")), "South America"));
        world.addContinent(new Continent(new Country("Chile", new BigDecimal("987654321")), "South America"));
        world.addContinent(new Continent(new Country("Argentina", new BigDecimal("987654321")), "South America"));
        world.addContinent(new Continent(new Country("Nigeria", new BigDecimal("1122334455")), "Africa"));
        world.addContinent(new Continent(new Country("Ivory Coast", new BigDecimal("1122334455")), "Africa"));

        //When
        BigDecimal worldPopulation = world.getPeopleQuantity();
        BigDecimal expectedPopulation = new BigDecimal("5578002240");

        //Then
        assertEquals(expectedPopulation, worldPopulation);
    }
}
