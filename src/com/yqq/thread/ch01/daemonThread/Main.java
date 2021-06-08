package com.yqq.thread.ch01.daemonThread;

public class Main {
    public static void main(String[] args) {
        try {
        MyThread t = new MyThread();
        t.setDaemon(true);
        Thread.sleep(5000);
        System.out.println("我离开thread对象也不再打印，也就停止");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
