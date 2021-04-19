package com.yqq.thread.ch01.sharedData;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread, "a");
        Thread b = new Thread(myThread, "b");
        Thread c = new Thread(myThread, "c");

        a.start();
        b.start();
        c.start();

    }
}

