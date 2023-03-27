package com.example.bookstore23.service;

import com.example.bookstore23.entity.User;
import com.example.bookstore23.ripositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean existByUserName(String username) {
        return userRepository.existsByUserName(username);
    }

    public User save(User build) {
        return userRepository.save(build);
    }

    public User findByUserName(String username) {
        return userRepository.findByUserName(username);
    }
}
