package com.kodilla.good.patterns.challenges.flightFinder;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlightFinder {

    public List<Flight> findFlight(FlightDatabase flightDatabase) {
        FlightDatabase flights = new FlightDatabase();
        System.out.println("Dear Traveler, please provide the city of origin...");
        String origin = new Scanner(System.in).nextLine();
        System.out.println("Dear Traveler, please provide the city of destination...");
        String destination = new Scanner(System.in).nextLine();
        System.out.println("Dear Traveler, please provide the city of stopover ...");
        String via = new Scanner(System.in).nextLine();

        List<Flight> resultListOfFlights = flights.getFlights().stream().
                filter(f ->f.getOrigin().equals(origin)).
                filter(f -> f.getDestination().equals(destination)).
                filter(f -> f.getVia().equals(via)).
                collect(Collectors.toList());

        return resultListOfFlights;
    }
}
