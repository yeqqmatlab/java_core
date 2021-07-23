package com.yqq.thread.ch02.p103;

/**
 * 字符串对象放在常量池，相同的字符串对象不会有新对象产生。
 * 所以synchronized锁一直同一个对象
 */
public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();


    }
}
