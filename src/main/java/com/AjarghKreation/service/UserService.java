package com.AjarghKreation.service;

import com.AjarghKreation.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
}
