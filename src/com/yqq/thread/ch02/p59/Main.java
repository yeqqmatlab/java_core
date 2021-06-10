package com.yqq.thread.ch02.p59;

/**
 * 1 A 线程先持有object对象的Lock锁, B线程可以异步的方式调用object对象的非synchronized类型的方法
 *
 * 2 A 线程先持有object对象的Lock锁, B线程调用object对象的其他synchronized类型的方法时需要排队等待,也就是同步。
 *
 */
public class Main {

    public static void main(String[] args) {

        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();


    }
}
