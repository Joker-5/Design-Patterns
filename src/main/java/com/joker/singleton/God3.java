package com.joker.singleton;/*
 *项目名: Design-Patterns
 *文件名: God3
 *创建者: 张昊
 *创建时间:2020/12/24 13:40
 *描述: TODO

 */

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
