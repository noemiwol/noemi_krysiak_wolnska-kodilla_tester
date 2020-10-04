package com.kodilla.spring.basic.spring_configuration.homework;




public class Cabrio implements Car {
    private boolean _areLightsTurnedOn;

    public Cabrio(boolean areLightsTurnedOn) {
        _areLightsTurnedOn = areLightsTurnedOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return _areLightsTurnedOn;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
