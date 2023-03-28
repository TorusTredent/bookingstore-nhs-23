package com.example.bookstore23.services;

import com.example.bookstore23.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();
    Book findByTitle(String title);
    void saveBook(Book book);
    void deleteBook(Long id);
    Book getBookById(Long id);
}
