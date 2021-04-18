package com.yqq.thread.ch01.myrunnable;

/**
 * 构造函数Thread(Runnable target) 不光可以传入一个Runnable接口对象，还可以传入一个Thread类对象，
 * 这样做完全可以将一个Thread对象中的run方法交给其他线程调用。
 */
public class Run {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("运行结束");

    }
}
