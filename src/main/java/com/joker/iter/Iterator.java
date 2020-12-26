package com.joker.iter;/*
 *项目名: Design-Patterns
 *文件名: Iterator
 *创建者: 张昊
 *创建时间:2020/12/26 14:50
 *描述: TODO

 */

public interface Iterator<E> {
    E next();

    boolean hasNext();
}
