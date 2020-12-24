package singleton;/*
 *项目名: Design-Patterns
 *文件名: God
 *创建者: 张昊
 *创建时间:2020/12/24 13:26
 *描述: 创建唯一神

 */


public class God {
    private static final God god = new God();

    private God() {
    }

    //1.最简单的饿汉模式,提前将god创建好
    public static God getInstanceEager() {
        return god;
    }

}