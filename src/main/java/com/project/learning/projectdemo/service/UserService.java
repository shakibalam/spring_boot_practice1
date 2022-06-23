package com.project.learning.projectdemo.service;

import com.project.learning.projectdemo.models.User;

import java.util.List;


public interface UserService {
    void insertUsers(User user);

    User getUserById(Integer id);

    List<User> getAllUsers();
}
