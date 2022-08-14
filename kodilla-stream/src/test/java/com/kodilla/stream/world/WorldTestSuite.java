package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    private World createTheWorld() {

        //Creating Countries
        Country poland = new Country("Poland", new BigDecimal("123456789"));
        Country greatBritain = new Country("Great Britain", new BigDecimal("123456789"));
        Country croatia = new Country("Croatia", new BigDecimal("123456789"));
        Country brazil = new Country("Brazil", new BigDecimal("987654321"));
        Country chile = new Country("Chile", new BigDecimal("987654321"));
        Country argentina = new Country("Argentina", new BigDecimal("987654321"));
        Country nigeria = new Country("Nigeria", new BigDecimal("1122334455"));
        Country ivoryCoast = new Country("IvoryCoast", new BigDecimal("1122334455"));

        //Creating Continents
        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(greatBritain);
        europe.addCountry(croatia);

        Continent southAmerica = new Continent("South America");
        southAmerica.addCountry(brazil);
        southAmerica.addCountry(chile);
        southAmerica.addCountry(argentina);

        Continent africa = new Continent("Africa");
        africa.addCountry(nigeria);
        africa.addCountry(ivoryCoast);

        // Creating the World
        World theWorld = new World();
        theWorld.addContinent(europe);
        theWorld.addContinent(southAmerica);
        theWorld.addContinent(africa);

        return theWorld;
    }

    @Test
    void testGetPeopleQuantity() {
        //Given
        World theWorld = createTheWorld();

        //When
        BigDecimal worldPopulation = theWorld.getPeopleQuantity();
        BigDecimal expectedPopulation = new BigDecimal("5578002240");

        //Then
        assertEquals(expectedPopulation, worldPopulation);
    }
}
