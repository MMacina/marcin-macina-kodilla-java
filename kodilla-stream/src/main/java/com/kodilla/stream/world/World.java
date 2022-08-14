package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> world = new ArrayList<>();

    public void addContinent(Continent continent) {
        world.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return world.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getCountryPopulation())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
