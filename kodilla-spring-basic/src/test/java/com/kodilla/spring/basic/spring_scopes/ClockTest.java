package com.kodilla.spring.basic.spring_scopes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ClockTest {
    @Test
    public void shouldCreateDifferentTime(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //When
        Clock localTimeFirst = context.getBean(Clock.class);
        Clock localTimeSecond =  context.getBean(Clock.class);
        //given
        Assertions.assertNotEquals(localTimeFirst,localTimeSecond );
        Assertions.assertNotEquals(localTimeFirst.currentTime().getNano(),localTimeSecond.currentTime().getNano() );
    }
}