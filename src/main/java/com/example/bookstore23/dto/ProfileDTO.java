package com.example.bookstore23.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProfileDTO {


    private String userName;
    private String password;
    private String email;
    private String mobile;
    private String address;
    private String country;

}
