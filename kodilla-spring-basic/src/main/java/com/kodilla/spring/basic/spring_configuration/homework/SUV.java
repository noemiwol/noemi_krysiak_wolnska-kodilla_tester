package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car{
    private boolean areLightsIsOn;

    public SUV(boolean areLightsTurnedOn) {
        areLightsIsOn = areLightsTurnedOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return areLightsIsOn;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
