package com.joker.template_method;/*
 *项目名: Design-Patterns
 *文件名: Human
 *创建者: 张昊
 *创建时间:2020/12/24 21:26
 *描述: TODO

 */

public class Human extends Mammal {

    @Override
    public void move() {
        System.out.println("用脚走~~~");
    }
}
