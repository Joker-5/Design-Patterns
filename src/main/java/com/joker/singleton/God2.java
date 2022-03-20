package com.joker.singleton;

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
