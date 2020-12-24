package com.joker.decorator;/*
 *项目名: Design-Patterns
 *文件名: Test
 *创建者: 张昊
 *创建时间:2020/12/24 22:14
 *描述: TODO

 */

public class Test {
    public static void main(String[] args) {
        Showable lipstick = new FoundationMakeup(new Lipstick(new Girl()));
        lipstick.show();
    }
}
