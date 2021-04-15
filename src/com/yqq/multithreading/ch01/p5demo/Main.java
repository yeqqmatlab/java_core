package com.yqq.multithreading.ch01.p5demo;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("end...");
    }
}
