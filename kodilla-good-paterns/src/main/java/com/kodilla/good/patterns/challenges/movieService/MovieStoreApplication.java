package com.kodilla.good.patterns.challenges.movieService;

import java.util.stream.Collectors;

public class MovieStoreApplication {

    public static void main(String[] args){
        MovieStore movieStore = new MovieStore();

        String theResultStringOfMovies = movieStore.getMovie().entrySet().stream()
                .map(entry -> entry.getKey() + entry.getValue().stream().collect(Collectors.joining(" ! ", " ! ", "")))
                .collect((Collectors.joining(" ! ", "<< ", " >>")));

        System.out.println(theResultStringOfMovies);
    }
}
