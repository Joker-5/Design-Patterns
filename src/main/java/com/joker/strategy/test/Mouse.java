package com.joker.strategy.test;/*
 *项目名: Design-Patterns
 *文件名: Mouse
 *创建者: 张昊
 *创建时间:2020/12/24 18:56
 *描述: TODO

 */

public class Mouse implements USB {
    @Override
    public void readData(String data) {
        System.out.println("从鼠标中读取数据：" + data);
    }
}
