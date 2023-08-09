package com.example.banco.repository;

import com.example.banco.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByCodeAndUserType(String code, String userType);
}
