package com.kodilla.stream.world;

import java.util.List;
import java.util.Objects;

public final class Continent {

    private final String continentName;
    private final List<Country> countries;

    public Continent(final String continentName, final List<Country> countries) {
        this.continentName = continentName;
        this.countries = countries;
    }

    public List<Country> getCountries() {
        return countries;
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
}
