package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"abc,true", "BGFS,true", "123,true","_,false","-,false","aa,false","Ba,false","noemi_wol@1K.-KI,false"})
    public void shouldReturnTrueIfValidateUsername(String username, Boolean expectedResult){
        boolean result = userValidator.validateUsername(username);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueIfStringEmailIsEmptyValidateEmail(String email) {
    assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @CsvSource(value ={"jan.kowalski@op.pl, true", "o@o.p, true", "sw78_54@sklep.com, true", "o3_O.pl, false",
            "janKowalskiop.pl, false", "fjUIH_12@jkdigjgfugh.figkfjf,false"})
    public void shouldReturnTrueIfValidateEmail(String email, Boolean expectedResult){
        boolean result = userValidator.validateEmail(email);
        assertEquals(expectedResult, result);
    }


}