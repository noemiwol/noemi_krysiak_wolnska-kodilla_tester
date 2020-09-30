package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ShippingCenterTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
    ShippingCenter bean = context.getBean(ShippingCenter.class);

    @Test
    void shouldSendPackage() {

        String address = bean.sendPackage("Main Street 7", 15.7);
        Assertions.assertEquals("Package delivered to: Main Street 7",address);

    }
    @Test
    void shouldDoNotSendPackage() {

        String address = bean.sendPackage("Main Street 7", 35.5);
        Assertions.assertEquals("Package not delivered to: Main Street 7",address);

    }
}