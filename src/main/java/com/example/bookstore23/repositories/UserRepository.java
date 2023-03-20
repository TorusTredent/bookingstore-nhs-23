package com.example.bookstore23.repositories;

import com.example.bookstore23.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserName(String userName);
}
