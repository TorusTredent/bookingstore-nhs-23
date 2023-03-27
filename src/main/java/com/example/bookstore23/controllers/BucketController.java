//package com.example.bookstore23.controllers;
//
//
//import com.example.bookstore23.entity.Book;
//import com.example.bookstore23.services.ServiceImpl.BucketServiceImpl;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequiredArgsConstructor
//@RequestMapping("/bucket")
//public class BucketController {
//
//    private final BucketServiceImpl bucketService;
//
//    @PostMapping("/{id}")
//    public String putInBucket(@PathVariable Book book){
//        bucketService.saveBookInBucket(book);
//        return "bucket";
//    }
//}
