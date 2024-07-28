package com.example.userauthapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.userauthapi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
