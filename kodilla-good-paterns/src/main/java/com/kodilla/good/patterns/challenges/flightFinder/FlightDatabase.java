package com.kodilla.good.patterns.challenges.flightFinder;

import java.util.ArrayList;
import java.util.List;

public final class FlightDatabase {

    private final List<Flight> flights = new ArrayList<>();

    public FlightDatabase() {
        flights.add(new Flight("Gdansk", "Wroclaw", "", 6, 00, 9, 30));
        flights.add(new Flight("Gdansk", "Wroclaw", "", 10, 15, 12, 45));
        flights.add(new Flight("Gdansk", "Wroclaw", "Krakow", 12, 10, 16, 30));
        flights.add(new Flight("Gdansk", "Wroclaw", "", 16, 25, 18, 55));
        flights.add(new Flight("Gdansk", "Wroclaw", "Krakow", 18, 30, 22, 35));
        flights.add(new Flight("Wroclaw", "Gdansk", "", 6, 00, 9, 30));
        flights.add(new Flight("Wroclaw", "Gdansk", "", 10, 15, 12, 45));
        flights.add(new Flight("Wroclaw", "Gdansk", "Krakow", 12, 10, 16, 30));
        flights.add(new Flight("Wroclaw", "Gdansk", "", 16, 25, 18, 55));
        flights.add(new Flight("Wroclaw", "Gdansk", "Warsaw", 18, 30, 22, 35));
        flights.add(new Flight("Wroclaw", "Krakow", "", 6, 00, 9, 30));
        flights.add(new Flight("Wroclaw", "Krakow", "", 10, 15, 12, 45));
        flights.add(new Flight("Wroclaw", "Krakow", "Gdansk", 12, 10, 16, 30));
        flights.add(new Flight("Wroclaw", "Krakow", "", 16, 25, 18, 55));
        flights.add(new Flight("Wroclaw", "Krakow", "Warsaw", 18, 30, 22, 35));
    }

    public List<Flight> getFlights() {
        return new ArrayList<>(flights);
    }
}
