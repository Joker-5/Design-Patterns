package com.joker.iter;/*
 *项目名: Design-Patterns
 *文件名: DrivingRecorder
 *创建者: 张昊
 *创建时间:2020/12/26 14:52
 *描述: TODO

 */

public class DrivingRecorder {
    private String[] records;

    private int idx;

    private static final int LENGTH = 10;

    public DrivingRecorder() {
        this.records = new String[LENGTH];
        this.idx = -1;
    }

    public void append(String record) {
        idx = idx == 9 ? 0 : idx + 1;
        records[idx] = record;
    }

    //返回迭代器
    public Iterator<String> iterator() {
        return new Iter();
    }

    //内部迭代器实现类
    private class Iter implements Iterator<String> {
        //迭代器自有游标，不污染类的游标
        int cursor = idx;

        int loopCount = 0;

        //逆序输出
        @Override
        public String next() {
            //常见的保存&&输出套路
            int i = cursor;
            if (cursor == 0) {
                cursor = 9;
            } else {
                cursor--;
            }
            loopCount++;
            return records[i];
        }

        @Override
        public boolean hasNext() {
            return loopCount < LENGTH;
        }
    }
}
