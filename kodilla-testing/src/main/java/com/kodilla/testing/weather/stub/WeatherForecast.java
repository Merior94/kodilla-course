package com.kodilla.testing.weather.stub;

import java.sql.Array;
import java.util.*;

public class WeatherForecast {
    private final Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateMeanTemperature(){
        double mean = 0;
        for(double value:this.temperatures.getTemperatures().values()){
            mean += value;
        }
        mean = (mean / this.temperatures.getTemperatures().size());

        return mean;
    }

    public double calculateMedianTemperature(){
        Object[] array = this.temperatures.getTemperatures().values().toArray();
        Arrays.sort(array);

        double result;
        if (this.temperatures.getTemperatures().size()%2 != 0) {
            result = (double) array[this.temperatures.getTemperatures().size()/2];
        } else {
            result = (double) array[(this.temperatures.getTemperatures().size()/2)];
            result += (double) array[(this.temperatures.getTemperatures().size()/2) -1];
            result /= 2;
        }

        return result;
    }
}