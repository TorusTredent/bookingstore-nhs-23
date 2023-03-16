package com.example.bookstore23.controllers;

import com.example.bookstore23.entity.Book;
import com.example.bookstore23.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

    @Controller
    @RequiredArgsConstructor
    public class BookController {

        private final BookService bookService;

        @GetMapping("/")
        public String books(@RequestParam(name = "title", required = false) String title, Model model){
            model.addAttribute("books", bookService.listBooks(title));
            return "books";
        }

        @GetMapping("/book/{id}")
        public String bookInfo(@PathVariable Long id, Model model){
            model.addAttribute("book", bookService.getBookById(id));
            return "book-info";
        }

        @PostMapping("/book/create")
        public String createBook(Book book){
            bookService.saveBook(book);
            return "redirect:/";
        }

        @PostMapping("/book/delete/{id}")
        public String deleteBook(@PathVariable Long id){
            bookService.deleteBook(id);
            return "redirect:/";
        }
    }
