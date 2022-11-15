package com.demo.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.config.RedisUtil;
import com.demo.convert.GameMapper;
import com.demo.entity.Game;
import com.demo.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private GameMapper gameMapper;

    @GetMapping("/{id}")
    public Object find(@PathVariable("id") Integer id) {
        return gameService.find(id);

    }

    @GetMapping("/wrong")
    public int error() {
        int i = 9 / 0;
        return i;
    }


    @GetMapping("/all")
    public Page<Game> findAll(@Param(value = "pageSize") Integer pageSize, @RequestParam(value = "pageNumber") Integer pageNumber) {
        System.out.println(pageSize);
        System.out.println(pageNumber);
        Page<Game> gamePage = gameService.findAll();
        return gamePage;
    }

}
