package com.example.bookstore23.services.impl;

import com.example.bookstore23.dto.ProfileDTO;
import com.example.bookstore23.entity.User;
import com.example.bookstore23.repositories.UserRepository;
import com.example.bookstore23.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User getByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }


    @Override
    public ProfileDTO mapUserToProfileDto(User user1) {
        return ProfileDTO.builder()

                .email(user1.getEmail())
                .address(user1.getAddress())
                .mobile(user1.getMobile())
                .country(user1.getCountry())
                .password(user1.getPassword())
                .userName(user1.getUserName())
                .build();
    }

    @Override
    public void mapProfileDTOToUser(User user1, ProfileDTO profileDTO) {
        user1.setAddress(profileDTO.getAddress());
        user1.setEmail(profileDTO.getEmail());
        user1.setUserName(profileDTO.getUserName());
        user1.setCountry(profileDTO.getCountry());
        user1.setMobile(profileDTO.getMobile());
        user1.setPassword(profileDTO.getPassword());
    }

    @Override
    public User save(User user1) {
        return userRepository.save(user1);
    }

    @Override
    public boolean existByUserName(String username) {
        return userRepository.existsByUserName(username);
    }

}
