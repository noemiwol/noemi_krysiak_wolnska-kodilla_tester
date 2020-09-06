package com.kodilla.collections.adv.immutable.specialspecial.homework;

import java.util.ArrayList;

public class BookManager  {
    public  Book createBook(String title, String author){

        for (Book book: bookArrayList){
            if (title == book.getTitle() && author == book.getAuthor())
            {
                return book;
            }
        }

        Book book = new Book( title, author);
        bookArrayList.add( book );
        return book;
    }

   private ArrayList<Book> bookArrayList = new ArrayList<>();


}
