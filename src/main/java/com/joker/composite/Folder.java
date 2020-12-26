package com.joker.composite;/*
 *项目名: Design-Patterns
 *文件名: Folder
 *创建者: 张昊
 *创建时间:2020/12/26 14:33
 *描述: TODO

 */

import java.util.ArrayList;
import java.util.List;

public class Folder extends Node {

    private List<Node> childrenNodes;

    public Folder(String name) {
        super(name);
        childrenNodes = new ArrayList<>();
    }

    @Override
    protected void add(Node child) {
        childrenNodes.add(child);
    }

    @Override
    //多叉树遍历模型
    protected void ls(int space) {
        super.ls(space);
        space++;
        for (Node node : childrenNodes) {
            node.ls(space);
        }
    }
}
