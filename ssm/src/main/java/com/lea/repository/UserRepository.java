package com.lea.repository;

import com.lea.entity.User;

import java.util.List;

public interface UserRepository {
    public List<User> findAll();
    public User login(String name,String password);
}
