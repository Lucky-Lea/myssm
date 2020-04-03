package com.lea.service.impl;

import com.lea.entity.User;
import com.lea.repository.UserRepository;
import com.lea.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User login(String name, String password) {
        return userRepository.login(name,password);
    }


}


