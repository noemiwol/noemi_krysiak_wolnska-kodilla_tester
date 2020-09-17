package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

   @ParameterizedTest
    @CsvFileSource(resources = "/userNumber.csv", numLinesToSkip = 1, delimiter = ':')
    public void shouldShowHowManyWins(String userNumbers, Boolean isValid) throws InvalidNumbersException {

        Set<Integer> userNumbersSet = new HashSet<>(Arrays.stream(userNumbers.split(",")).map(n -> Integer.parseInt(n)).collect(Collectors.toList()));

        if(isValid){
            assertDoesNotThrow(() -> gamblingMachine.howManyWins(userNumbersSet));
        }
        else{
            assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbersSet));
        }
    }
}