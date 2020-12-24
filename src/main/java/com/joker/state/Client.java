package com.joker.state;/*
 *项目名: Design-Patterns
 *文件名: Client
 *创建者: 张昊
 *创建时间:2020/12/24 21:02
 *描述: TODO

 */

public class Client {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        switcher.switchOff();
        switcher.switchOn();
        switcher.switchOff();
        switcher.switchOff();
        switcher.switchOn();
        switcher.switchOn();
    }
}
