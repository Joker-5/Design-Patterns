package com.joker.iter;/*
 *项目名: Design-Patterns
 *文件名: Client
 *创建者: 张昊
 *创建时间:2020/12/26 15:03
 *描述: TODO

 */

public class Client {
    public static void main(String[] args) {
        DrivingRecorder drivingRecorder = new DrivingRecorder();
        for (int i = 0; i < 12; i++) {
            drivingRecorder.append("msg -> " + i);
        }
        Iterator<String> iter = drivingRecorder.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
