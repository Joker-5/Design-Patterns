package com.joker.strategy;/*
 *项目名: Design-Patterns
 *文件名: Client
 *创建者: 张昊
 *创建时间:2020/12/24 18:48
 *描述: TODO

 */

import com.joker.strategy.operation.Addition;
import com.joker.strategy.operation.Multiplication;
import com.joker.strategy.operation.Subtraction;

public class Client {
    public static void main(String[] args) {
        //注入策略
        Calculator calculator = new Calculator(new Subtraction());
        System.out.println(calculator.getResult(10,12));
    }
}
