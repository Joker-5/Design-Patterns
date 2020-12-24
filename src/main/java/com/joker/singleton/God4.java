package com.joker.singleton;/*
 *项目名: Design-Patterns
 *文件名: God4
 *创建者: 张昊
 *创建时间:2020/12/24 13:40
 *描述: TODO

 */

public class God4 {
    private volatile static God4 god;

    private God4() {

    }

    //4.在判空的方法内部进行加锁，避免每个线程调用此方法时都需要加锁，提升效率
    //这样的话也就是只有第一批排队阻塞的线程稍微慢一些，后面的就很快了
    //当然更好的方法是用LockSupport的那些轻量级锁=，=
    public static God4 getInstanceLockedLighter() {
        //如果为空就进入同步块
        if (god == null) {
            //大量线程进入这里
            synchronized (God4.class) {
                //第一个线程实例化god
                if (god == null) {
                    god = new God4();
                }
            }
        }
        return god;
    }
}
