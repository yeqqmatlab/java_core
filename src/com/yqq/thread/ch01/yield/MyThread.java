package com.yqq.thread.ch01.yield;

public class MyThread extends Thread{

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {

            Thread.yield();

        }
        long end = System.currentTimeMillis();
        long len = end - start;
        System.out.println("len = " + len);
    }
}
