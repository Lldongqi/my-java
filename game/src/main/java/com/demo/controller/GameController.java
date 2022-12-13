package com.demo.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.config.RedisUtil;
import com.demo.convert.GameMapper;
import com.demo.demo.User;
import com.demo.entity.Game;
import com.demo.service.GameService;
import com.demo.service.Strategy;
import com.example.springbootautoconfigure.annotation.StarterLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


@RestController()
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private GameMapper gameMapper;

    @Autowired
    private List<Strategy> strategy;

    @GetMapping("/{id}")
    public String find(@PathVariable("id") Integer id) {
        Optional<Strategy> first = this.strategy.stream().filter(e -> e.currentType(2)).findFirst();
        return first.get().playGame();
    }

    @GetMapping("/wrong")
    public int error() {
        int i = 9 / 0;
        return i;
    }

    @GetMapping("/list")
    public Stream<Integer> getList() {
        com.demo.demo.User user = new com.demo.demo.User(1, "张三", 18);
        com.demo.demo.User user1 = new com.demo.demo.User(2, "李四", 18);
        com.demo.demo.User user2 = new com.demo.demo.User(3, "张三", 20);
        ArrayList<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        list.add(user2);
        return list.stream().map(e->{
                    return e.getId();
                });
    }
    @StarterLog(desc = "测试starter")
    @GetMapping("/all")
    public Page<Game> findAll(@Param(value = "pageSize") Integer pageSize, @RequestParam(value = "pageNumber") Integer pageNumber) {
        Page<Game> gamePage = gameService.findAll();
        return gamePage;
    }

}
