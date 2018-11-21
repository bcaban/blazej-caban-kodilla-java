package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        BigDecimal country1Quantity = new BigDecimal("38655971");
        BigDecimal country2Quantity = new BigDecimal("32698787");
        BigDecimal country3Quantity = new BigDecimal("308878120");
        BigDecimal country4Quantity = new BigDecimal("33989040");
        BigDecimal country5Quantity = new BigDecimal("198739269");
        BigDecimal country6Quantity = new BigDecimal("40913584");

        List<Country> countryList1 = new ArrayList<>();
        Country country1 = new Country("Poland", country1Quantity);
        Country country2 = new Country("Spain", country2Quantity);
        countryList1.add(country1);
        countryList1.add(country2);

        List<Country> countryList2 = new ArrayList<>();
        Country country3 = new Country("USA", country3Quantity);
        Country country4 = new Country("Canada", country4Quantity);
        countryList2.add(country3);
        countryList2.add(country4);

        List<Country> countryList3 = new ArrayList<>();
        Country country5 = new Country("Brazil", country5Quantity);
        Country country6 = new Country("Argentina", country6Quantity);
        countryList3.add(country5);
        countryList3.add(country6);



        List<Continent> continentList = new ArrayList<>();
        Continent continent1 = new Continent("Europe", countryList1);
        Continent continent2 = new Continent("North America", countryList2);
        Continent continent3 = new Continent("South America", countryList3);
        continentList.add(continent1);
        continentList.add(continent2);
        continentList.add(continent3);

        //When
        World world = new World(continentList);
        BigDecimal totalQuantity = world.getPeopleQuantity();



        //Then
        BigDecimal expectedQuantity = new BigDecimal("653874771");
        Assert.assertEquals(expectedQuantity, totalQuantity);
    }
}
