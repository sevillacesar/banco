package com.example.banco.service.impl;

import com.example.banco.dto.UserDTO;
import com.example.banco.entity.User;
import com.example.banco.repository.UserRepository;
import com.example.banco.service.UserService;
import com.example.banco.util.MapperUtil;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO getUser(String code, String userType) {
        Optional<User> optionalUser = userRepository.findByCodeAndUserType(code, userType);
        if (optionalUser.isEmpty()) {
            throw new ObjectNotFoundException(User.class, "User");
        }
        return MapperUtil.mapperUserToDTO(optionalUser.get());
    }
}
