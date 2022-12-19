package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Continent australia = new Continent();
        Country australiaCountry = new Country(new BigDecimal("10000000"));
        australia.addCountry(australiaCountry);

        Continent america = new Continent();
        Country usa = new Country(new BigDecimal("180000000"));
        Country canada = new Country(new BigDecimal("8000000"));
        Country mexico = new Country(new BigDecimal("250000000"));
        america.addCountry(usa);
        america.addCountry(canada);
        america.addCountry(mexico);

        Continent asia = new Continent();
        Country russia = new Country(new BigDecimal("120000000"));
        Country china = new Country(new BigDecimal("2000000000"));
        Country india = new Country(new BigDecimal("2100000000"));
        asia.addCountry(russia);
        asia.addCountry(china);
        asia.addCountry(india);

        Continent europe = new Continent();
        Country poland = new Country(new BigDecimal("38000000"));
        Country germany = new Country(new BigDecimal("80000000"));
        Country france = new Country(new BigDecimal("70000000"));
        Country monaco = new Country(new BigDecimal("20000"));
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        europe.addCountry(monaco);

        World world = new World();
        world.addContinent(asia);
        world.addContinent(america);
        world.addContinent(australia);
        world.addContinent(europe);

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedPeopleQuantity = new BigDecimal("4856020000");

        //Then
        Assertions.assertEquals(expectedPeopleQuantity, peopleQuantity);
    }
}
