package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main(String[] args) {
        Flight flight1 = new Flight("Oslo", "London");
        Flight flight2 = new Flight("New York", "Brno");
        Flight flight3 = new Flight("Warsaw", "Reykjavik");

        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not Found \n" + e);
        } finally {
            System.out.println("Wish to find another destination?");
        }

        System.out.println("...\n");

        try {
            flightFinder.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not Found \n" + e);
        } finally {
            System.out.println("Wish to find another destination?");
        }

        System.out.println("...\n");


        try {
            flightFinder.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not Found \n" + e);
        } finally {
            System.out.println("Wish to find another destination?");
        }

        System.out.println("...\n");
    }
}