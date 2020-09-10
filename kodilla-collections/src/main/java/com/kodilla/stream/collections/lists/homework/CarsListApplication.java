package com.kodilla.stream.collections.lists.homework;


import com.kodilla.stream.collections.interfaces.homework.*;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {


    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add( new Bmw( 15 ) );
        cars.add( new Bmw( 20 ) );
        cars.add( new Vw( 5 ) );
        cars.add( new Vw( 10 ) );
        cars.add( new Audi( 3 ) );
        cars.add( new Audi( 2 ) );

        for (Car car: cars) {
            CarUtils.describeCar( car );
        }

        System.out.println("--------------------");

        cars.remove( 5 );
        cars.remove( new Bmw( 15 ));
        for (Car car: cars) {
            CarUtils.describeCar( car );
        }

    }
}
