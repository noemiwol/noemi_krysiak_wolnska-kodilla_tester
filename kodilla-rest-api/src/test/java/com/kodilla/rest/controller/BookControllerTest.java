package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookControllerTest {


    @Test
    public void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("Title 1", "Author 1"));
        bookList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);
        //when
        List<BookDto> result = bookController.getBooks();
        //then
        assertThat(result).hasSize(2);
    }
    @Test
    public void shouldAddFourBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("Title 1", "Author 1"));
        bookList.add(new BookDto("Title 2", "Author 2"));
        bookList.add(new BookDto("Title 3", "Author 3"));
        bookList.add(new BookDto("Title 4", "Author 4"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);
        //when
        List<BookDto> result = bookController.getBooks();
        //then
        assertThat(result).hasSize(4);
    }
    @Test
    public void shouldRemoveFourBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("Title 1", "Author 1"));
        bookList.add(new BookDto("Title 2", "Author 2"));
        bookList.add(new BookDto("Title 3", "Author 3"));
        bookList.add(new BookDto("Title 4", "Author 4"));
        bookList.remove(new BookDto("Title 3", "Author 3"));
        bookList.remove(new BookDto("Title 4", "Author 4"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);
        //when
        List<BookDto> result = bookController.getBooks();
        //then
        assertThat(result).hasSize(2);
    }
}