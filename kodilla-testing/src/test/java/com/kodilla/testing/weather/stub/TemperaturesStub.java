package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class TemperaturesStub implements Temperatures{

    @Override
    public Map<String, Double> getTemperatures() {
        Map<String, Double> stubResult = new HashMap<>();

        stubResult.put("Rzeszow", 25.5);
        stubResult.put("Krakow", 26.5);
        stubResult.put("Wroclaw", 28.3);
        stubResult.put("Warsaw", 22.7);
        stubResult.put("Katowice", 21.9);

        return stubResult;
    }
}
