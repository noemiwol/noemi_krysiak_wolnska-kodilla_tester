package MethodStatic;

public class Book {
    private String author;
    private String title;

    private Book(String author, String title){
        this.author = author;
        this.title = title;

    }

    public static Book of(String author, String title){
       Book book = new Book(author, title);
       return book;
    }



    public static void example(){

        Book book = Book.of("Isaac Asimov", "The Galaxy");

    }

}
