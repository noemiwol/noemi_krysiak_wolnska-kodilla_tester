package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {
    private boolean areLightsIsOn;

    public Cabrio(boolean areLightsTurnedOn) {
        areLightsIsOn = areLightsTurnedOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return areLightsIsOn;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
