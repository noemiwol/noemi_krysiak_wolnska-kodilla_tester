package com.kodilla.stream.immutable;


import com.kodilla.stream.collections.adv.immutable.specialspecial.homework.Book;
import com.kodilla.stream.collections.adv.immutable.specialspecial.homework.BookManager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BookManagerTestSuite {

    @Test
    public void addressesOfTheCreatedObjectsAreTheSame_createBook(){
        //given
        BookManager bookManager = new BookManager();


        //when
        Book book1 = bookManager.createBook( "Żywiec", "Jan kowalski" );
        Book book2 = bookManager.createBook( "Trolli", "Edyta Maślak" );

        //then
        assertNotEquals( book1, book2 );

    }

    @Test
    public void isTwoObjectWithTheSameReference_createBook(){
        //given
        BookManager bookManager = new BookManager();


        //when
        Book book1 = bookManager.createBook( "Trolli", "Edyta Maślak" );
        Book book2 = bookManager.createBook( "Trolli", "Edyta Maślak" );

        //then
        assertSame( book1, book2 );

    }

    @Test
    public void isTheSameAuthor_createBook(){
        //given
        BookManager bookManager = new BookManager();
        String expectedAuthor = "Edyta Maślak";

        //when
        Book book1 = bookManager.createBook( "Trolli", expectedAuthor );

        //then
        assertEquals( book1.getAuthor(), expectedAuthor );

    }

    @Test
    public void isTheSameTitle_createBook(){
        //given
        BookManager bookManager = new BookManager();
        String expectedTitle = "Żywiec";

        //when
        Book book1 = bookManager.createBook(expectedTitle,"Jan kowalski"   );
        //then
        assertEquals( book1.getTitle(),expectedTitle );

    }
}

