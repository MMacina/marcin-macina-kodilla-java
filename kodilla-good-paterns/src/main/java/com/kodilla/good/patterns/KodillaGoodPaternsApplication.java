package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.stream.Collectors;

public class KodillaGoodPaternsApplication {

    public static void main(String[] args){
        MovieStore movieStore = new MovieStore();

        String theResultStringOfMovies = movieStore.getMovie().entrySet().stream()
                .map(entry -> entry.getKey() + entry.getValue().stream().collect(Collectors.joining(" ! ", " ! ", "")))
                .collect((Collectors.joining(" ! ", "<< ", " >>")));

        System.out.println(theResultStringOfMovies);
    }

}
