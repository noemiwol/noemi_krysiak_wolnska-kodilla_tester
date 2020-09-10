package com.kodilla.stream.collections.adv.immutable.specialspecial.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book book1 = bookManager.createBook( "Żywiec", "Jan kowalski" );
        Book book2 = bookManager.createBook( "Trolli", "Edyta Maślak" );
        Book book3 = bookManager.createBook( "Jura", "Zbigniew Maciaszek" );

    }

}
