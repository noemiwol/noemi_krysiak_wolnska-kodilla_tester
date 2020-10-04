package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car {
    private boolean areLightsIsOn;
    public Sedan(boolean areLightsTurnedOn) {
        areLightsIsOn = areLightsTurnedOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return areLightsIsOn;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
