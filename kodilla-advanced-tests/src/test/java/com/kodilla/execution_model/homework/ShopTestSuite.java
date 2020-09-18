package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTestSuite {
    Shop shop = new Shop();
    Order order1 = new Order(145.50, LocalDate.of(2020,8,18),"ksylon");
    Order order2 = new Order(99.99, LocalDate.of(2020,9,16),"nill");
    Order order3 = new Order(1458.89, LocalDate.of(2020,9,20),"tycio_98");

    @Test
    public void shouldAddOrderToShop(){
        //when
        Integer numberOfOrder = shop.listOfOrders.size();
        //then
        assertEquals(3,numberOfOrder);
    }

    @Test
    public void shouldListOfDateOrder(){
        //when
        Set<LocalDate> dataOrders = shop.listOfDateOrder(LocalDate.of(2020,9,1),LocalDate.of(2020,9,30));
        //then
        assertEquals(shop.listOfDateOrder(LocalDate.of(2020,9,1),LocalDate.of(2020,9,30)),dataOrders);

    }
    @Test
    public void shouldGetMaxOrder(){
        //when
        double maxOrder = shop.getMaxOrder();
        //then
        assertEquals(1458.89,maxOrder);

    }
    @Test
    public void shouldGetMinOrder() {
        //when
        double minOrder = shop.getMinOrder();
        //then
        assertEquals(99.99,shop.getMinOrder());
    }

    @Test
    public void shouldSumOrder(){
        //when
        double sumOrder = shop.sumOrder();
        //then
        assertEquals(1704.38,shop.sumOrder());
    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}