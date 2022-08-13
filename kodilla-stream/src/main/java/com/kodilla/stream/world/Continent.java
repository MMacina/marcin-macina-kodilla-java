package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Continent {

    private final Country country;
    private final String continentName;

    public Continent(Country country, String continentName) {
        this.country = country;
        this.continentName = continentName;
    }

    public Country getCountry() {
        return country;
    }

    public String getContinentName() {
        return continentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        return Objects.equals(continentName, continent.continentName);
    }

    public List<Country> countriesOnContinent() {
        List<Country> countriesOnContinent = new ArrayList<>();
        countriesOnContinent.add(country);

        return countriesOnContinent;
    }
}
