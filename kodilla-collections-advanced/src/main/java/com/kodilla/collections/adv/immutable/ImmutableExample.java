package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        Book book = new Book( "Jozek Kowalski", "Czarna dziura" );

        BookHacked bookHacked = new  BookHacked("Stefan kluska", "Ostry cień mgły");
        bookHacked.modifyTitle( "Mój ból" );
        System.out.println(book.getTitle());
    }
}
