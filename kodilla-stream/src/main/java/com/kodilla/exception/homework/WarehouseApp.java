package com.kodilla.exception.homework;

public class WarehouseApp {
public static void main(String[] args) {
    Warehouse warehouse = new Warehouse();
    warehouse.addOrder(new Order("1"));
    warehouse.addOrder(new Order("2"));
    warehouse.addOrder(new Order("3"));
    warehouse.addOrder(new Order("4"));
    try {
        System.out.println(warehouse.getOrder("3") + " znajduje się na magazynie " );
        System.out.println(warehouse.getOrder("5") + " znajduje się na magazynie " );
    } catch (OrderDoesntExistException orderDoesntExistException) {
        System.out.println("Podane zamównie nieistnieje. Sprawdź pononwnie");

    }
}
}
