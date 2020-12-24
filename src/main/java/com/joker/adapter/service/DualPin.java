package com.joker.adapter.service;/*
 *项目名: Design-Patterns
 *文件名: DualPin
 *创建者: 张昊
 *创建时间:2020/12/24 14:02
 *描述: TODO

 */

public interface DualPin {
    /**
     * @param live  火线
     * @param _null 零线
     */
    public void electrify(int live, int _null);
}
