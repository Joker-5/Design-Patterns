package com.joker.strategy.test;/*
 *项目名: Design-Patterns
 *文件名: Computer
 *创建者: 张昊
 *创建时间:2020/12/24 18:55
 *描述: TODO

 */

public class Computer {
    //接口注入
    private USB usb;

    public Computer(USB usb) {
        this.usb = usb;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }

    public void getData(String data) {
        usb.readData(data);
    }
}
