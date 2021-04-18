package com.yqq.thread.ch01.sharedData;

public class MyThread extends Thread{

    private int count = 5;

    @Override
    public void run() {
        super.run();
        count --;
        System.out.println("由"+Thread.currentThread().getName()+"计算count="+count);
    }
}
