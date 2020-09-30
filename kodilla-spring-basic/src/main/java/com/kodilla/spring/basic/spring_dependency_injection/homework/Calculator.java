package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    @Autowired
    public void setDisplay(Display display) {
        this.display = display;
    }

    public double add(double a, double b){

            return this.display.display(a +b);
    }

    public double subtract(double a, double b){

        return this.display.display(a - b);
    }

    public double multiply(double a, double b){

        return this.display.display(a * b);
    }

    public double divide(double a, double b){

        return this.display.display(a / b);
    }

}
