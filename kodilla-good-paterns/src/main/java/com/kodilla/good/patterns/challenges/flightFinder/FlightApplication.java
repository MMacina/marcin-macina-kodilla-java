package com.kodilla.good.patterns.challenges.flightFinder;

import java.util.List;

public class FlightApplication {

    public static void main(String[] args) {
        FlightDatabase flightDatabase = new FlightDatabase();
        FlightFinder flightFinder = new FlightFinder();

        List<Flight> resultList = flightFinder.findFlight(flightDatabase);

        if(resultList.isEmpty()) {
            System.out.println("No matching flights were founded");
        } else {
            System.out.println(resultList);
        }
    }
}
