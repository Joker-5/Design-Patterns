package com.joker.strategy.test;/*
 *项目名: Design-Patterns
 *文件名: Test
 *创建者: 张昊
 *创建时间:2020/12/24 18:59
 *描述: TODO

 */

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer(new KeyBoard());
        computer.getData("asd");
    }
}
