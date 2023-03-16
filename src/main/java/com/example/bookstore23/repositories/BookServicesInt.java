package com.example.bookstore23.repositories;

import com.example.bookstore23.entity.Book;

import java.util.List;

public interface BookServicesInt {

    List<Book> listBooks(String title);
    void saveBook(Book book);
    void deleteBook(Long id);
    Book getBookById(Long id);
}
