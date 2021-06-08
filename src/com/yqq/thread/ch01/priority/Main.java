package com.yqq.thread.ch01.priority;

/**
 * 线程优先级的继承性
 * 在java中，线程的优先级具有继承
 */
public class Main {
    public static void main(String[] args) {


        System.out.println("\"main thread begin priority =\" + Thread.currentThread().getPriority() = " + "main thread begin priority =" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("\"main thread begin priority =\" + Thread.currentThread().getPriority() = " + "main thread begin priority =" + Thread.currentThread().getPriority());

        MyThread1 t1 = new MyThread1();
        t1.start();
    }
}
