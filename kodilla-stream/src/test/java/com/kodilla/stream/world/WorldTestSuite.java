package com.kodilla.stream.world;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {

        World world = new World();
        world.addContinent(new Continent("Europe", Collections.singletonList(new Country("Poland", new BigDecimal("123456789")))));
        world.addContinent(new Continent("Europe", Collections.singletonList(new Country("Great Britain", new BigDecimal("123456789")))));
        world.addContinent(new Continent("Europe", Collections.singletonList(new Country("Croatia", new BigDecimal("123456789")))));
        world.addContinent(new Continent("South America", Collections.singletonList(new Country("Brazil", new BigDecimal("987654321")))));
        world.addContinent(new Continent("South America", Collections.singletonList(new Country("Chile", new BigDecimal("987654321")))));
        world.addContinent(new Continent("South America", Collections.singletonList(new Country("Argentina", new BigDecimal("987654321")))));
        world.addContinent(new Continent("Africa", Collections.singletonList(new Country("Nigeria", new BigDecimal("1122334455")))));
        world.addContinent(new Continent("Africa", Collections.singletonList(new Country("Ivory Coast", new BigDecimal("1122334455")))));

        //When
        BigDecimal worldPopulation = world.getPeopleQuantity();
        BigDecimal expectedPopulation = new BigDecimal("5578002240");

        //Then
        assertEquals(expectedPopulation, worldPopulation);
    }
}
