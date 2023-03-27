//package com.example.bookstore23.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDateTime;
//import java.util.Locale;
//@Entity
//@Table(name="history")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Component
//public class History {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private LocalDateTime data;
//    @OneToOne
//    private Book book;
//    private double price;
//    private String country;
//    private String address;
//    @OneToOne
//    private User user;
//}
