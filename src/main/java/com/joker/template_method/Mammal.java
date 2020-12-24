package com.joker.template_method;/*
 *项目名: Design-Patterns
 *文件名: Mannal
 *创建者: 张昊
 *创建时间:2020/12/24 21:23
 *描述: TODO

 */

public abstract class Mammal {
    private boolean isFemale;

    //通常都是用protected级别进行修饰
    protected final void feedMilk() {
        if (isFemale) {
            System.out.println("可以喂奶");
        } else {
            System.out.println("你喂你马呢");
        }
    }

    public abstract void move();
}
