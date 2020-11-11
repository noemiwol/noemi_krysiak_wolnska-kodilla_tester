package com.kodilla.jacoco;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class YearTest extends TestCase {
    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }
}