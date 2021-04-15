package com.yqq.multithreading.ch01.p5demo;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}
