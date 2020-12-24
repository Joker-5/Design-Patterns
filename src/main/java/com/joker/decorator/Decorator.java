package com.joker.decorator;/*
 *项目名: Design-Patterns
 *文件名: Decorator
 *创建者: 张昊
 *创建时间:2020/12/24 22:08
 *描述: TODO

 */


public abstract class Decorator implements Showable {
    //注意此处不可设置为私有的，不然子类会访问不到
    Showable showable;

    public Decorator(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
    }
}
