package com.joker.adapter;/*
 *项目名: Design-Patterns
 *文件名: Adapter
 *创建者: 张昊
 *创建时间:2020/12/24 14:03
 *描述: 三转二适配器

 */

import com.joker.adapter.service.DualPin;
import com.joker.adapter.service.TriplePin;

public class Adapter implements TriplePin {

    private DualPin dualPinDevice;

    //通过适配器实现二接适配器，适配器接三
    public Adapter(DualPin dualPin) {
        this.dualPinDevice = dualPin;
    }

    @Override
    //三转二，地线废弃
    public void electrify(int live, int _null, int earth) {
        dualPinDevice.electrify(live, _null);
    }
}
