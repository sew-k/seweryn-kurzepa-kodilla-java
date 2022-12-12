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

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemp() {
        double result = 0.0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            result += temperature.getValue();
        }
        if (temperatures.getTemperatures().size() > 0) {
            result = result / (temperatures.getTemperatures().size());
        }
        return result;
    }

    public double medianOfTemp() {
        double result;
        int tempRows = temperatures.getTemperatures().size();
        double[] temperaturesValues = new double[tempRows];
        int i = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperaturesValues[i] = temperature.getValue();
            i++;
        }
        Arrays.sort(temperaturesValues);

        if (tempRows % 2 != 0) {
            result = temperaturesValues[(tempRows)/2];
        } else {
            result = (temperaturesValues[(tempRows)/2 - 1] + temperaturesValues[(tempRows)/2]) / 2;
        }

        return result;
    }
}
