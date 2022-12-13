package com.demo.service.impl;

import com.demo.service.Strategy;
import org.springframework.stereotype.Service;

import java.util.Objects;


@Service
public class StrategyTwo implements Strategy {
    @Override
    public boolean currentType(Integer type) {
        return Objects.equals(type,2);
    }

    @Override
    public String playGame() {
        return "打王者荣耀。。。。";
    }
}
