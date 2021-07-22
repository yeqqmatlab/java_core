package com.yqq.thread.ch02.p90;

/**
 * 多线程异步 --> 解决脏读.md
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyOneList list = new MyOneList();
        ThreadA a = new ThreadA(list);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(list);
        b.setName("B");
        b.start();
        Thread.sleep(6000);
        System.out.println("list.getSize() = " + list.getSize());


    }
}
