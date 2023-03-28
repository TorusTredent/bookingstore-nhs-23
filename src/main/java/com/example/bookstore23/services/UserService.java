package com.example.bookstore23.services;

import com.example.bookstore23.dto.ProfileDTO;
import com.example.bookstore23.entity.User;

public interface UserService {
    User getByUserName(String userName);

    ProfileDTO mapUserToProfileDto(User user1);

    void mapProfileDTOToUser(User user1, ProfileDTO profileDTO);

    User save(User user1);

    boolean existByUserName(String username);
}
