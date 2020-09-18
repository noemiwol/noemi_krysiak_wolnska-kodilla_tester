package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

    public class Shop {
    Set<Order> listOfOrders = new HashSet<>();

    public void addOrder(Order order){
        this.listOfOrders.add(order);
    }

    public Set<LocalDate> listOfDateOrder(LocalDate start, LocalDate end){
       return listOfOrders
                .stream()
                .map(Order::getData)
                .filter(d -> d.isAfter(start))
                .filter(d -> d.isBefore(end))
                .collect(Collectors.toSet());
    }

    public double getMaxOrder(){
       return listOfOrders
                .stream()
                .mapToDouble(Order::getOrderValue)
                .max()
               .getAsDouble();

    }
    public double getMinOrder(){
        return listOfOrders
                .stream()
                .mapToDouble(Order::getOrderValue)
                .min()
                .getAsDouble();

    }

    public double sumOrder(){
        return listOfOrders
                .stream()
                .mapToDouble(Order::getOrderValue)
                .sum();
    }
    }
