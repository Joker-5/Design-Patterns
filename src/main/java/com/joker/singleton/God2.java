package com.joker.singleton;/*
 *项目名: Design-Patterns
 *文件名: God2
 *创建者: 张昊
 *创建时间:2020/12/24 13:40
 *描述: TODO

 */

public class God2 {
    private static God2 god;

    private God2() {
    }

    //2.懒汉模式，只有在调用的时候才进行实例化
    public static God2 getInstanceLazy() {
        if (god == null) {
            god = new God2();
        }
        return god;
    }
}
