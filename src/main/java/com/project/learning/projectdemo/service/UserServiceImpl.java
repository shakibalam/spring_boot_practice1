package com.project.learning.projectdemo.service;

import com.project.learning.projectdemo.dao.UserDao;
import com.project.learning.projectdemo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


//@ComponentScan(basePackages = {"com.project.learning.projectdemo"})
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDao userDao;

    @Override
    public void insertUsers(User user)
    {
         userDao.save(user);
    }

    @Override
    public User getUserById(Integer id)
    {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUser();
    }
}
