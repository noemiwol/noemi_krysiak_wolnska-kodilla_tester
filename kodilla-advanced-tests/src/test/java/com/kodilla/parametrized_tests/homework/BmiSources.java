package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BmiSources {
    static Stream<Arguments> provideGetBMI() {
        return Stream.of(
            Arguments.of(new Person(1.70, 93.5),"Obese Class I (Moderately obese)"),
            Arguments.of(new Person(1.55, 80),"Obese Class I (Moderately obese)"),
            Arguments.of(new Person(1.75, 102.5),"Obese Class I (Moderately obese)"),
            Arguments.of(new Person(1.50, 50),"Normal (healthy weight)")
        );
    }
}
