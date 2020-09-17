package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"abc,true", "BGFS,true", "123,true","_,false","-,false","aa,false","Ba,false","noemi_wol@1K.-KI,false"})
   //@ValueSource(strings = {"abc", "BGFS", "123","_","-","aa","Ba","noemi_wol@1K.-KI"})
    public void shouldReturnTrueIfValidateUsernameCorrect(String username, Boolean expectedResult){
        boolean result = userValidator.validateUsername(username);
        assertEquals(expectedResult, result);
    }

    /*@ParameterizedTest
    @ValueSource(strings = {"abc", "BGFS", "123","_","-","aa","Ba","noemi_wol@1K.-KI"})
    public void shouldReturnTrueIfValidateEmailCorrect(String username){
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }*/

}