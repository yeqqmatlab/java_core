package com.yqq.thread.ch01.priority;

public class MyThread2 extends Thread {

    @Override
    public void run() {
        System.out.println("this.getPriority() = " + this.getPriority());
    }
}
