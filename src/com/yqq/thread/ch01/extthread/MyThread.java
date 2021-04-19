package com.yqq.thread.ch01.extthread;

public class MyThread extends Thread{
    private int i;

    public MyThread(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("t"+i);
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
//        System.out.println(i);
    }
}
