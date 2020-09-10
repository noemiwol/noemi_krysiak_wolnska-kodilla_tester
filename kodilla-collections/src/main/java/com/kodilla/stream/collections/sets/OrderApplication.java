package com.kodilla.stream.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class OrderApplication {
    public static void main(String[] args) {
        Set<Order> orders = new HashSet<>();
        orders.add( new Order( "01/2020", "IKEA" , 1.00) );
        orders.add( new Order( "02/2020","Obi",3.0 ) );
        orders.add( new Order( "03/2020", "Bruno",2.0 ) );
        orders.add( new Order( "04/2020","Szop",5.0 ) );
        orders.add( new Order( "01/2020", "IKEA" , 1.00) );

        System.out.println(orders.size());
        for (Order order: orders) {
            System.out.println(order);

        }
    }
}
