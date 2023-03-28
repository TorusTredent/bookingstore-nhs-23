package com.example.bookstore23.services.ServiceImpl;

import com.example.bookstore23.entity.Book;
import com.example.bookstore23.repositories.BookRepository;
import com.example.bookstore23.services.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public List<Book> findAll(){
       return bookRepository.findAll();
    }

    public Book findByTitle(String title){
        return (Book) bookRepository.findByTitle(title);
    }

    public void saveBook(Book book){
        log.info("Saving new {}", book);
        bookRepository.save(book);
    }

    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
}
