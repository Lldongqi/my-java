package com.demo.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.entity.Game;
import com.demo.mapper.GameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Vector;

/**
 * 游戏(Game)表服务接口
 *
 * @author makejava
 * @since 2022-08-12 18:09:15
 */
@Service
public class GameService {
    @Autowired
    private GameMapper gameMapper;

    public Game find(Integer id){
       return gameMapper.queryById(id);
    }

    public Page<Game> findAll(){
        QueryWrapper<Game> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("code","G202203280001");
        return gameMapper.selectPage(new Page<>(0, 10),queryWrapper);
    }
}
