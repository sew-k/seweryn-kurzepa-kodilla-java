package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DisplayName("TDD: Weather Forecast Test Suite")
@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    private static int testCounter = 0;
    private static Map<String, Double> temperaturesMap = new HashMap<>();
    @Mock
    private Temperatures temperaturesMock;

    @BeforeAll
    public static void beforeAllTests() {
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);

        System.out.println("-------------------------------------------------------");
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
        System.out.println("-------------------------------------------------------");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @Test
    void testAverageTempWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double averageTemp = weatherForecast.averageTemp();
        double expectedAverageTemp = 25.56;

        //Then
        Assertions.assertEquals(expectedAverageTemp, averageTemp);
    }
    @Test
    void testMedianOfTempWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double medianOfTemp = weatherForecast.medianOfTemp();
        double expectedMedianOfTemp = 25.5;

        //Then
        Assertions.assertEquals(expectedMedianOfTemp, medianOfTemp);
    }
}
