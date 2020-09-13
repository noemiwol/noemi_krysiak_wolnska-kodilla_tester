package com.kodilla.exception.homework;

import java.util.*;

public class Warehouse {

    private ArrayList<Order> orderList = new ArrayList<>();

    public void addOrder(Order order){
        orderList.add(order);
    }

   public Order getOrder(String number) throws OrderDoesntExistExceptio {

        return orderList.stream()
                .filter(o -> o.number.equals(number))
                .findFirst()
                .orElseThrow(OrderDoesntExistExceptio::new);
    }
}

