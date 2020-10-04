package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarFactoryTest {

 @Test
    public void shouldCreateSedanWithLightsOnCarCreate(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        //When
        Car car = (Car) context.getBean("createCar", "AUTUMN", LocalTime.of(21,0));

        //Then
        Assertions.assertNotNull(car);
        Assertions.assertEquals("Sedan", car.getCarType() );
        Assertions.assertEquals(true, car.hasHeadlightsTurnedOn() );


    }
    @Test
    public void shouldCreateSedanWithLightsOffCarCreate(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        //When
        Car car = (Car) context.getBean("createCar", "SUMMER", LocalTime.of(8,0));

        //Then
        Assertions.assertNotNull(car);
        Assertions.assertEquals("Cabrio", car.getCarType() );
        Assertions.assertEquals(false, car.hasHeadlightsTurnedOn() );


    }


}