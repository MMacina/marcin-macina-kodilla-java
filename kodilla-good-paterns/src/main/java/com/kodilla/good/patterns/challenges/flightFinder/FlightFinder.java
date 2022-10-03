package com.kodilla.good.patterns.challenges.flightFinder;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    public static void main(String[] args) {
        FlightDatabase flights = new FlightDatabase();
        flights.getFlights().stream().
                filter(f ->f.getOrigin().equals("Gdansk")).
                filter(f -> f.getDestination().equals("Wroclaw")).
                filter(f -> f.getVia().equals("Krakow")).
                forEach(System.out::println);


    }
}
