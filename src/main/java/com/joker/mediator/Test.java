package com.joker.mediator;/*
 *项目名: Design-Patterns
 *文件名: Test
 *创建者: 张昊
 *创建时间:2020/12/25 14:54
 *描述: TODO

 */

public class Test {
    public static void main(String[] args) {
        User zs = new User("张三");
        User dio = new User("Dio");
        User diavolo = new User("Diavolo");
        ChatRoom chatRoom = new ChatRoom("one room");
        dio.login(chatRoom);
        zs.login(chatRoom);
        diavolo.login(chatRoom);
        zs.talk("傻逼！！！");

    }
}
