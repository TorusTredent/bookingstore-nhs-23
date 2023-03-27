//package com.example.bookstore23.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Entity
//@Table(name="buckets")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Component
//public class Bucket {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToMany
//    private List<Book> book;
//    @OneToOne
//    private User user;
//}
