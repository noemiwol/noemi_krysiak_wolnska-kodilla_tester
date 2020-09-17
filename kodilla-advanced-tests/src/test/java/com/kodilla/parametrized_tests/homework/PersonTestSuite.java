package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {
    @ParameterizedTest
    @MethodSource(value = {"com.kodilla.parametrized_tests.homework.BmiSources#provideGetBMI"})
    public void shouldCalculateBMI(Person person, String expectedResult){
        assertEquals(person.getBMI(),expectedResult );
    }


}