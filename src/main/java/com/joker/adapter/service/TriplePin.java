package com.joker.adapter.service;/*
 *项目名: Design-Patterns
 *文件名: TriplePin
 *创建者: 张昊
 *创建时间:2020/12/24 14:03
 *描述: TODO

 */

public interface TriplePin {
    /**
     * @param live  火线
     * @param _null 零线
     * @param earth 地线
     */
    public void electrify(int live, int _null, int earth);
}
