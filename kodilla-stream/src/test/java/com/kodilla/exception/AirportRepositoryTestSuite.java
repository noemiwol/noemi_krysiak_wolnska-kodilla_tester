package com.kodilla.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.Assert.*;

public class AirportRepositoryTestSuite {

   @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        //given
        AirportRepository airportRepository = new AirportRepository();
        //when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        //then
        assertTrue(isWarsawInUse);
    }

    @Test
    public void testInAirportInUse_withException() {
        //given
        AirportRepository airportRepository = new AirportRepository();

        //when & then
        Assertions.assertThrows(AirportNotFoundException.class,
        () ->
        {
            airportRepository.isAirportInUse("Vienna");
        });
    }


}