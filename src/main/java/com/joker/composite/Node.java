package com.joker.composite;/*
 *项目名: Design-Patterns
 *文件名: Node
 *创建者: 张昊
 *创建时间:2020/12/26 14:33
 *描述: TODO

 */

public abstract class Node {
    private String name;

    public Node(String name) {
        this.name = name;
    }

    //不同子类有着不同的行为
    protected abstract void add(Node child);

    //子类都会用到的直接就实现了
    protected void ls(int space) {
        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }
        System.out.println(this.name);
    }

    //重载，调用更为方便
    protected void ls() {
        this.ls(0);
    }
}
