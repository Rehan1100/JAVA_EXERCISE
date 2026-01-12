package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User saveUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
    Page<User> searchUsers(String name, int page, int size);
}

