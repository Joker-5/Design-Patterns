package com.joker.singleton;


public class God {
    private static final God god = new God();

    private God() {
    }

    //1.最简单的饿汉模式,提前将god创建好
    public static God getInstanceEager() {
        return god;
    }

}