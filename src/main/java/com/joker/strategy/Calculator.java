package com.joker.strategy;/*
 *项目名: Design-Patterns
 *文件名: Calculator
 *创建者: 张昊
 *创建时间:2020/12/24 18:45
 *描述: TODO

 */

public class Calculator {
    //直接将策略注入即可
    private Strategy strategy;

    public Calculator(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    //如此便实现了运算逻辑与实体类之间的解耦，便于程序的拓展
    public int getResult(int x, int y) {
        return strategy.calculate(x, y);
    }
}
