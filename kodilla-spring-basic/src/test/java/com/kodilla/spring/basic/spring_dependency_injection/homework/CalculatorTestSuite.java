package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CalculatorTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator bean  = context.getBean(Calculator.class);

    @Test
    void shouldTwoParametersAdd() {
        double a = 5;
        double b = 7.5;
        double sum = bean.add(a,b);
        Assertions.assertEquals(12.5,sum);
    }

    @Test
    void shouldTwoParametersSubtract() {
        double a = 5;
        double b = 7.5;
        double sub = bean.subtract(a,b);
        Assertions.assertEquals(-2.5,sub);
    }

    @Test
    void shouldTwoParametersMultiply() {
        double a = 5;
        double b = 7.5;
        double mul = bean.multiply(a,b);
        Assertions.assertEquals(37.5,mul);

    }

    @Test
    void shouldTwoParametersDivide() {
        double a = 35;
        double b = 7;
        double div = bean.divide(a,b);
        Assertions.assertEquals(5,div);
    }
}