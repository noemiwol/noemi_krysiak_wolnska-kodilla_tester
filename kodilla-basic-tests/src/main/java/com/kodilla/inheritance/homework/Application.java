package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {

        Mint mint = new Mint(2020);
        mint.turnOn();
        mint.getTheYearOfPublishment();
        mint.displayYearOperatingSystem();
        mint.turnOff();

        Ubuntu ubuntu = new Ubuntu(2019);
        ubuntu.turnOn();
        ubuntu.getTheYearOfPublishment();
        ubuntu.displayYearOperatingSystem();
        ubuntu.turnOff();

    }
}
