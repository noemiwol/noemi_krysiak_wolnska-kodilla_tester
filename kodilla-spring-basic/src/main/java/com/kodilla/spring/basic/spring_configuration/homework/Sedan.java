package com.kodilla.spring.basic.spring_configuration.homework;



public class Sedan implements Car {
    private boolean _areLightsTurnedOn;
    public Sedan(boolean areLightsTurnedOn) {
        _areLightsTurnedOn = areLightsTurnedOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return _areLightsTurnedOn;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
