package com.joker.composite;/*
 *项目名: Design-Patterns
 *文件名: File
 *创建者: 张昊
 *创建时间:2020/12/26 14:35
 *描述: TODO

 */

public class File extends Node {
    public File(String name) {
        super(name);
    }

    @Override
    protected void add(Node child) {
        System.out.println("不可添加子节点~");
    }

    @Override
    protected void ls(int space) {
        super.ls(space);
    }
}
