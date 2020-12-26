package com.joker.composite;/*
 *项目名: Design-Patterns
 *文件名: Client
 *创建者: 张昊
 *创建时间:2020/12/26 14:36
 *描述: TODO

 */


public class Client {
    public static void main(String[] args) {
        Folder folder = new Folder("Joker");
        Folder dio = new Folder("Dio");
        File la = new File("La");
        folder.add(dio);
        dio.add(la);
        folder.ls();
    }
}
