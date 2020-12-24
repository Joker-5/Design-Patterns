package com.joker.prototype.pattern;/*
 *项目名: Design-Patterns
 *文件名: Test
 *创建者: 张昊
 *创建时间:2020/12/23 23:56
 *描述: TODO

 */

import com.joker.prototype.bean.Plane;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Plane> planes = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            planes.add(PlaneFactory.planeFactory(new Random().nextInt()));
        }
    }
}
