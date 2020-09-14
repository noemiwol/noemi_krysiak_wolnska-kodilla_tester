package com.kodilla.exception.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {
    @Test
    public void testOrderIsAdd_addOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        Order order = new Order("5");
        warehouse.addOrder(order);
        //then
        assertTrue(warehouse.getOrder("5").equals(order));
    }

   @Test
    public void testOrderIsExist_getOrder_withException(){
        //given
        Warehouse warehouse = new Warehouse();
        //when & then
       Assertions.assertThrows(OrderDoesntExistException.class,
               () ->
               {
                   warehouse.getOrder("6");
               });
    }

}