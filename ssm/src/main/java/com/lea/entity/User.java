package com.lea.entity;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String gender;
    private  int age;
    private String phone;
    private String password;

}
