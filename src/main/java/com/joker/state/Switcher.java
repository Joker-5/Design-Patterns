package com.joker.state;/*
 *项目名: Design-Patterns
 *文件名: Switcher
 *创建者: 张昊
 *创建时间:2020/12/24 20:57
 *描述: TODO

 */

public class Switcher {
    //开关默认是关闭状态
    private State state = new Off();

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void switchOn() {
        state.switchOn(this);
    }

    public void switchOff() {
        state.switchOff(this);
    }
}
