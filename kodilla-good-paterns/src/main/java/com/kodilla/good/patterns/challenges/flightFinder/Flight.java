package com.kodilla.good.patterns.challenges.flightFinder;
import java.time.LocalTime;
import java.util.Objects;

public final class Flight {
    private final String origin;
    private final String destination;
    private final String via;
    private final LocalTime departureTime;
    private final LocalTime arrivalTime;

    public Flight(final String origin, final String destination, final String via, final int departureHour, final int departureMinute, final int arrivalHour, final int arrivalMinute) {
        this.origin = origin;
        this.destination = destination;
        this.via = via;
        this.departureTime = LocalTime.of(departureHour, departureMinute);
        this.arrivalTime = LocalTime.of(arrivalHour,arrivalMinute);
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getVia() {
        return via;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!Objects.equals(origin, flight.origin)) return false;
        if (!Objects.equals(destination, flight.destination)) return false;
        if (!Objects.equals(departureTime, flight.departureTime)) return false;
        return Objects.equals(arrivalTime, flight.arrivalTime);
    }

    @Override
    public int hashCode() {
        int result = origin != null ? origin.hashCode() : 0;
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        result = 31 * result + (departureTime != null ? departureTime.hashCode() : 0);
        result = 31 * result + (arrivalTime != null ? arrivalTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "\nFlight[" +
                "origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", via='" + via + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                "]";
    }
}
