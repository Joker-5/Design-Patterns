package com.joker.state;/*
 *项目名: Design-Patterns
 *文件名: On
 *创建者: 张昊
 *创建时间:2020/12/24 20:57
 *描述: TODO

 */

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class On implements State{
    @Override
    public void switchOn(Switcher switcher) {
        System.out.println("已经打开了~");
    }

    @Override
    public void switchOff(Switcher switcher) {
        System.out.println("关闭成功~~~");
        switcher.setState(new Off());
    }
}
