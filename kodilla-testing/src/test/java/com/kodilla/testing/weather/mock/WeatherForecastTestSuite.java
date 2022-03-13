package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    private final Map<String, Double> temperaturesMap = new HashMap<>();

    @BeforeEach
    public void BeforeEach(){
        //System.out.println("Mocking data...");
        temperaturesMap.put("Rzeszów", 25.5);
        temperaturesMap.put("Kraków", 26.2);
        temperaturesMap.put("Wrocław", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdańsk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    void testCalculateForecastWithMock() {
        System.out.println("testCalculateForecastWithMock()");
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateMeanTemperature() {
        System.out.println("testCalculateMeanTemperature()");
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double mean = weatherForecast.calculateMeanTemperature();
        double expectedMean = (25.5 + 26.2 + 24.8 + 25.2 + 26.1)/5.0;
        expectedMean = Math.round(expectedMean*100.0)/100.0;

        //Then
        Assertions.assertEquals(expectedMean, mean);
    }

    @Test
    void testCalculateMedianTemperature() {
        System.out.println("testCalculateMedianTemperature()");
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double median = weatherForecast.calculateMedianTemperature();
        double expectedMedian = 25.5;

        //Then
        Assertions.assertEquals(expectedMedian, median);
    }
}