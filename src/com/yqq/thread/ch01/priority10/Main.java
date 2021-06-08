package com.yqq.thread.ch01.priority10;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            MyThread1 t1 = new MyThread1();
            t1.setPriority(10);
            MyThread2 t2 = new MyThread2();
            t2.setPriority(1);
            t1.start();
            t2.start();
        }



    }
}
