package com.kodilla.testing.weather.stub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {

        Map<String, Double> resultMap = new HashMap<>();
        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue());
        }

        return resultMap;
    }

    public Double calculateAverageTemperature() {

        Double sumOfTemperatures = 0.0;
        Double averageTemperature;
        for (Double temperatureSum : temperatures.getTemperatures().values()) {
            sumOfTemperatures += temperatureSum;
        }
        averageTemperature = sumOfTemperatures/temperatures.getTemperatures().entrySet().size();

        return averageTemperature;
    }

    public Double calculateMedianTemperature() {

        Double medianTemperature = 0.0;
        Double[] TableOfTemperatures = temperatures.getTemperatures().values().toArray(new Double[0]);
        Arrays.sort(TableOfTemperatures);

        if (TableOfTemperatures.length % 2 == 0) {
            medianTemperature = (TableOfTemperatures[TableOfTemperatures.length / 2] +
                    TableOfTemperatures[(TableOfTemperatures.length / 2) - 1]) / 2;
        } else {
            medianTemperature = TableOfTemperatures[TableOfTemperatures.length /2 ];
        }

        return medianTemperature;
    }
}