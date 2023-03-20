package com.example.bookstore23.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Builder
@Entity
@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
    private String email;
    private String mobile;
    private String address;
    private String country;

//    @OneToMany
//    private List<Book> postBook;
//    @OneToOne
//    private Bucket bucket;
//    @OneToMany
//    private List<History> history;
}
