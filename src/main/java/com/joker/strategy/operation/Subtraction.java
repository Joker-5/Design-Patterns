package com.joker.strategy.operation;/*
 *项目名: Design-Patterns
 *文件名: Subtraction
 *创建者: 张昊
 *创建时间:2020/12/24 18:46
 *描述: TODO

 */

import com.joker.strategy.Strategy;

public class Subtraction implements Strategy {
    @Override
    public int calculate(int x, int y) {
        return x - y;
    }
}
