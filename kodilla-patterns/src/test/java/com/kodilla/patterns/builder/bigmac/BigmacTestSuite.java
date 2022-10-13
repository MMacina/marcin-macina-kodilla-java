package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBuildBurger() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Plain")
                .burgers(2)
                .sauce("Spicy")
                .ingredients("tomatoes")
                .ingredients("onions")
                .ingredients("lettuce")
                .ingredients("cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String whatBun = bigmac.getBun();
        String whatSauce = bigmac.getSauce();
        //Then
        assertEquals(4, howManyIngredients);
        assertEquals(2, howManyBurgers);
        assertEquals("Plain", whatBun);
        assertEquals("Spicy", whatSauce);
    }
}
