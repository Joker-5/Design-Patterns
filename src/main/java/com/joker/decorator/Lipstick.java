package com.joker.decorator;/*
 *项目名: Design-Patterns
 *文件名: Lipstick
 *创建者: 张昊
 *创建时间:2020/12/24 22:13
 *描述: TODO

 */

public class Lipstick extends Decorator {
    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.println("上唇膏(");
        showable.show();
        System.out.println(")");
    }
}
