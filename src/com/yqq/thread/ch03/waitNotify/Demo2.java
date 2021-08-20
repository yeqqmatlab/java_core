package com.yqq.thread.ch03.waitNotify;

public class Demo2 {

    public static Object object = new Object();

    public static void main(String[] args) throws InterruptedException {

        ThreadA a = new ThreadA();
        a.setName("A");
        ThreadB b = new ThreadB();
        b.setName("B");
        a.start();
        Thread.sleep(1000);
        b.start();

    }

    /**
     *  tip : 体会
     * 线程A获取到了锁...
     * 线程A阻塞并释放锁...
     * 线程B获取到了锁...
     * 线程B唤醒了正在wait的线程...
     * 线程B执行完成...
     * 线程A执行完成...
     */

    static class ThreadA extends Thread{

        @Override
        public void run() {

            synchronized (object){
                System.out.println("线程" + Thread.currentThread().getName()
                        + "获取到了锁...");

                try {
                    System.out.println("线程" + Thread.currentThread().getName()
                            + "阻塞并释放锁...");
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("线程" + Thread.currentThread().getName()
                        + "执行完成...");

            }

        }
    }

    static class ThreadB extends Thread{

        @Override
        public void run() {
            synchronized (object){
                System.out.println("线程" + Thread.currentThread().getName()
                        + "获取到了锁...");
                object.notify();
                System.out.println("线程" + Thread.currentThread().getName()
                        + "唤醒了正在wait的线程...");

                System.out.println("线程" + Thread.currentThread().getName() + "执行完成...");
            }

        }
    }

}

