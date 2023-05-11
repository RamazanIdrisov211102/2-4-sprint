package kz.kaz.javaEE.list;

import kz.kaz.javaEE.entity.Book;

import java.util.ArrayList;

public class BookList {
    private static ArrayList<Book> books = new ArrayList<>();
    private static Long id = 5L;

    static
    {
        books.add(new Book(1L, "1984", "George Orwell","978-0451524935",1949,15));
        books.add(new Book(2L, "To Kill a Mockingbird", "Harper Lee","978-0446310789",1960,20));
        books.add(new Book(3L, "The Alchemist", "Paulo Coelho","978-0062315007",1988,10));
        books.add(new Book(4L, "The Da Vinci Code", "Dan Brown","978-0307474278",2003,12));
    }

    public static void addBook(Book b){
        b.setId(id);
        books.add(b);
        id++;
    }
    public static ArrayList<Book> getAllBooks(){
        return books;
    }
}
