package com.yqq.thread.ch01.priority;

public class MyThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("this.getPriority() = " + this.getPriority());

        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}
