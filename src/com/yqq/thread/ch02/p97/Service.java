package com.yqq.thread.ch02.p97;


/**
 * 静态同步 synchronized
 */
public class Service {

    synchronized public static void printA(){
        try {
             System.out.println("线程名称： " + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入同步代码块" );

             Thread.sleep(3000);

             System.out.println("线程名称： "+ Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开代码块");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public static void printB(){
        try {
            System.out.println("线程名称： " + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入同步代码块" );

            Thread.sleep(3000);

            System.out.println("线程名称： "+ Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开代码块");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 非静态 synchronized
     */

    synchronized public void printC(){
        try {
            System.out.println("线程名称： " + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入同步代码块" );

            Thread.sleep(3000);

            System.out.println("线程名称： "+ Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开代码块");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
