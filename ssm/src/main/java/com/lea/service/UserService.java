package com.lea.service;

import com.lea.entity.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User login(String name,String password );
}
