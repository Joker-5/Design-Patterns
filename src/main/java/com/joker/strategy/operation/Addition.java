package com.joker.strategy.operation;/*
 *项目名: Design-Patterns
 *文件名: Addition
 *创建者: 张昊
 *创建时间:2020/12/24 18:45
 *描述: TODO

 */

import com.joker.strategy.Strategy;

public class Addition implements Strategy {
    @Override
    public int calculate(int x, int y) {
        return x + y;
    }
}
