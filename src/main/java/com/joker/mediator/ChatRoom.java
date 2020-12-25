package com.joker.mediator;/*
 *项目名: Design-Patterns
 *文件名: ChatRoom
 *创建者: 张昊
 *创建时间:2020/12/25 15:04
 *描述: TODO

 */

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private String name;

    private List<User> users;

    public ChatRoom(String name) {
        this.name = name;
        this.users = new ArrayList<>();
    }

    public void connect(User user) {
        users.add(user);
        System.out.println("欢迎" + user.getName() + "加入聊天室~~");
    }

    public void sendMessage(User user, String msg) {
        users
                .stream()
                .filter(item -> !item.equals(user))
                .forEach(listener -> listener.listen(user, msg));
    }


}
