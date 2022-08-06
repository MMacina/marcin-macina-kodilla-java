package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    void mockData() {
        //Given
        //Temperatures temperaturesMock = mock(Temperatures.class);
        Map<String,Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.5);
        temperaturesMap.put("Wroclaw", 28.3);
        temperaturesMap.put("Warsaw", 22.7);
        temperaturesMap.put("Katowice", 21.9);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    @DisplayName("Weather calculation test")
    void testCalculateForecastWithMock() {

        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    @DisplayName("Average temperature calculation test")
    void testCalculateAverageTemperatureWithMock() {

        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        Double averageTemperature = weatherForecast.calculateAverageTemperature();

        //Then
        Assertions.assertEquals(24.98, averageTemperature);
    }

    @Test
    @DisplayName("Median temperature calculation test - odd list")
    void testMedianTemperatureWithMockOddList() {

        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        Double medianTemperature = weatherForecast.calculateMedianTemperature();

        //Then
        Assertions.assertEquals(25.50, medianTemperature);
    }

    @Test
    @DisplayName("Median temperature calculation test - even list")
    void testMedianTemperatureWithMockEvenList() {

        //Given
        temperaturesMock.getTemperatures().put("Przemysl", 22.9);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        Double medianTemperature = weatherForecast.calculateMedianTemperature();

        //Then
        Assertions.assertEquals(24.20, medianTemperature);
    }
}
