package com.joker.adapter.entity;/*
 *项目名: Design-Patterns
 *文件名: TV
 *创建者: 张昊
 *创建时间:2020/12/24 14:03
 *描述: TODO

 */

import com.joker.adapter.service.DualPin;

public class TV implements DualPin {
    @Override
    public void electrify(int live, int _null) {
        System.out.println("火线是" + live);
        System.out.println("零线是" + _null);
    }
}
