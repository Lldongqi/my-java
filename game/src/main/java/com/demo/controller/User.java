package com.demo.controller;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    String name;
    Integer salary;
    Integer age;
    String sex;
    String city;
}
