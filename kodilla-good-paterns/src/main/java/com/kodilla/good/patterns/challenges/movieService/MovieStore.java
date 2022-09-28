package com.kodilla.good.patterns.challenges.movieService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieStore {

    public Map<String, List<String>> getMovie() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Zelazny Czlowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Msciciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Blyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> bookTitlesWithTranslations = new HashMap<>();
        bookTitlesWithTranslations.put("IM", ironManTranslations);
        bookTitlesWithTranslations.put("AV", avengersTranslations);
        bookTitlesWithTranslations.put("FL", flashTranslations);

        return bookTitlesWithTranslations;
    }

}
