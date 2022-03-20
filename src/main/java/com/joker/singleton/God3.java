package com.joker.singleton;

public class God3 {
    private static God3 god;

    private God3() {

    }

    //3.解决多线程可能会产生多个神的问题
    public static synchronized God3 GetInstanceLocked() {
        if (god == null) {
            god = new God3();
        }
        return god;
    }
}
