package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalTime;


@Configuration
public class CarFactory {
    /*W klasie konfiguracyjnej utwórz metodę, która będzie zwracać beana w zależności od pory roku.
    Jeśli jest lato, chcemy jeździć kabrioletem, zimą SUVem, wiosną i jesienią sedanem.
    Dodatkowo, samochód powinien mieć włączone światła, jeśli godzina jest w zakresie 20:00 – 06:00*/
    private String autumn = "AUTUMN";
    private String spring = "SPRING";
    private String summer = "SUMMER";
    private String winter = "WINTER";

    @Bean(name = "createCar")
    @Scope("prototype")
    public Car createCar(String season, LocalTime localTime)  {
        boolean areLightsTurnedOn;
        if (localTime.isBefore(LocalTime.of(20,0))&& localTime.isAfter(LocalTime.of(6,0))){
            areLightsTurnedOn = false;
        }else{
            areLightsTurnedOn = true;
        }

        if(season.equals(autumn) || season.equals(spring)){
            return new Sedan(areLightsTurnedOn);
        } else if (season.equals(summer)){
            return new Cabrio(areLightsTurnedOn);
        } else if(season.equals(winter)) {
            return new SUV(areLightsTurnedOn);
        }else {
            return null;
        }

    }

}
