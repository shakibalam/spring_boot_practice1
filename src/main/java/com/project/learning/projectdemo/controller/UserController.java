package com.project.learning.projectdemo.controller;

import com.project.learning.projectdemo.models.User;
import com.project.learning.projectdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projectdemo/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @PostMapping("/insert")
    public void insertUser(@RequestBody User user)
    {
         userService.insertUsers(user);
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable("id") Integer id)
    {
      return userService.getUserById(id);
    }

    @GetMapping("/getAllUser")
    public ResponseEntity<List<User>> getAllUsers()
    {
        return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
    }
}
