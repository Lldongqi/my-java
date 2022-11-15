package com.demo.controller;


import lombok.Data;

@Data
public class User {

    String name;
    Integer age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
