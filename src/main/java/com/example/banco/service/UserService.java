package com.example.banco.service;

import com.example.banco.dto.UserDTO;

public interface UserService {
    UserDTO getUser(String code, String userType);
}
