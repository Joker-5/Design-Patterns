package com.joker.decorator;/*
 *项目名: Design-Patterns
 *文件名: FoundationMakeup
 *创建者: 张昊
 *创建时间:2020/12/24 22:10
 *描述: TODO

 */


public class FoundationMakeup extends Decorator {


    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.println("打粉底(");
        showable.show();
        System.out.println(")");
    }
}
