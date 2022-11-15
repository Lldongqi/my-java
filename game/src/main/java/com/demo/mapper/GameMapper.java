package com.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.entity.Game;
import org.springframework.stereotype.Repository;


@Repository
public interface GameMapper extends BaseMapper<Game> {
    Game queryById(Integer id);

}
