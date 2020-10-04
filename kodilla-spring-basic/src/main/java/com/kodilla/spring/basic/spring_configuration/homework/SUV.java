package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.Instant;
import java.time.LocalTime;

public class SUV implements Car{
    public LocalTime now;
    private boolean _areLightsTurnedOn;

    public SUV(boolean areLightsTurnedOn) {
        _areLightsTurnedOn = areLightsTurnedOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {

        if (now.isAfter(LocalTime.of(6, 00)) && now.isBefore(LocalTime.of(20, 00))) {
            return false;
        }
        return true;

    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
