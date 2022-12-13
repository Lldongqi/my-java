package com.demo.service.impl;

import com.demo.service.Strategy;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class StrategyOne implements Strategy {
    @Override
    public boolean currentType(Integer type) {
        return Objects.equals(type,1);
    }

    @Override
    public String playGame() {
        return "打英雄联盟。。。";
    }
}
