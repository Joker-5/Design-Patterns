package com.joker.iter;

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
