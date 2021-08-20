package com.yqq.thread.ch02.p107;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        DeadTread t1 = new DeadTread();
        t1.setFlag("a");
        Thread thread1 = new Thread(t1);
        thread1.start();
        //等待一会然a线程去执行
        Thread.sleep(100);

        t1.setFlag("b");
        Thread thread2 = new Thread(t1);
        thread2.start();

    }
}
