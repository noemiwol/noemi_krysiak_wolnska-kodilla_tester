package controller;

import com.kodilla.rest.service.BookService;
import domain.BookDto;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDto> getBooks(){
        return bookService.getBooks();
    }

    @PostMapping
    public void addBooks(@RequestBody BookDto bookDto){
    bookService.addBook(bookDto);
    }
}