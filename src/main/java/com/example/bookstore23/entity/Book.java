package com.example.bookstore23.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Entity
@Table(name="books")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description", columnDefinition = "text")
    private String description;
    @Column(name = "bookAuthor")
    private String bookAuthor;
    @Column(name = "price")
    private double price;
    @Column(name = "author")
    private String author;
}

