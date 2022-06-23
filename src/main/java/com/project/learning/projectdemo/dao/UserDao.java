package com.project.learning.projectdemo.dao;

import com.project.learning.projectdemo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User,Integer>
{
    @Query(value = "select * from user where id=?1",nativeQuery = true)
    User getUserById(Integer id);

    @Query(value = "select * from user",nativeQuery = true)
    List<User> getAllUser();
}
