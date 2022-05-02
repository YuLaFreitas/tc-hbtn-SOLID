package com.example.use_cases;

import com.example.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserController extends JpaRepository<User, String> {
}
