package com.joker.mediator;/*
 *项目名: Design-Patterns
 *文件名: People
 *创建者: 张昊
 *创建时间:2020/12/25 14:54
 *描述: TODO

 */

import java.nio.channels.Channel;

public class User {
    private String name;
    private ChatRoom chatRoom;

    public User(String name) {
        this.name = name;
    }

    public void login(ChatRoom chatRoom) {
        chatRoom.connect(this);
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return this.name;
    }

    public void talk(String msg) {
        chatRoom.sendMessage(this, msg);
    }

    public void listen(User user, String msg) {
        System.out.println(this.getName() + " 听 " + user.getName() + " 说：" + msg);
    }

}
