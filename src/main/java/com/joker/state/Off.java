package com.joker.state;/*
 *项目名: Design-Patterns
 *文件名: Off
 *创建者: 张昊
 *创建时间:2020/12/24 20:57
 *描述: TODO

 */

public class Off implements State {
    @Override
    public void switchOn(Switcher switcher) {
        System.out.println("开启成功~~~");
        switcher.setState(new On());
    }

    @Override
    public void switchOff(Switcher switcher) {
        System.out.println("已经关了你tm的还关个几把啊！！！");
    }
}
