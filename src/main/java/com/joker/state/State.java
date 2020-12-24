package com.joker.state;/*
 *项目名: Design-Patterns
 *文件名: State
 *创建者: 张昊
 *创建时间:2020/12/24 20:57
 *描述: TODO

 */

public interface State {
    void switchOn(Switcher switcher);

    void switchOff(Switcher switcher);
}
