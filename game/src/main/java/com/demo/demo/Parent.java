package com.demo.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Parent {

    public void test(){

    }

    public static void main(String[] args) {
        User user = new User(1, "张三", 18);
        User user1 = new User(1, "李四", 18);
        User user2 = new User(1, "张三", 20);
        ArrayList<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        list.add(user2);

        Map<String, List<User>> collect = list.stream().collect(
                Collectors.groupingBy(a -> a.getName()));


    }
}
