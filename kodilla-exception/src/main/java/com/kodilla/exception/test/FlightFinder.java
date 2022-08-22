package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> destinations = new HashMap<>();
        destinations.put("London", true);
        destinations.put("Warsaw", true);
        destinations.put("Brno", false);
        destinations.put("Berlin", true);
        destinations.put("Rzeszow", false);
        destinations.put("Zagreb", true);

        if (destinations.containsKey(flight.getArrivalAirport()) && destinations.get(flight.getArrivalAirport()).booleanValue()) {
            System.out.println("Destination: " + flight.getArrivalAirport() + " is available. Wish to book a flight?");
        } else {
            System.out.println("Destination: " + flight.getArrivalAirport() + " is unavailable");
            throw new RouteNotFoundException("Destination is unavailable or doesn't exists");

        }
    }
}