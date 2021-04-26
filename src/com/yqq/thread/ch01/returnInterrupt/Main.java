package com.yqq.thread.ch01.returnInterrupt;



public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        Thread.sleep(1000);
        t.interrupt();
    }
}
