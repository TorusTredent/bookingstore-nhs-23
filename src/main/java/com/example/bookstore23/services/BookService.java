package com.example.bookstore23.services;

import com.example.bookstore23.entity.Book;
import com.example.bookstore23.repositories.BookRepository;
import com.example.bookstore23.repositories.BookServicesInt;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class BookService implements BookServicesInt {

    private final BookRepository bookRepository;

    @Override
    public List<Book> listBooks(String title) {
        if(title != null) return bookRepository.findByTitle(title);
        return bookRepository.findAll();
    }

    @Override
    public void saveBook(Book book){
        log.info("Saving new {}", book);
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
}
