package com.yqq.thread.ch02.p120;


/**
 * 用一个线程去停止另一个线程
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        PrintString printString = new PrintString();
        new Thread(printString).start();

        Thread.sleep(10000);
        System.out.println("我要停止它！ stopThread=" + Thread.currentThread().getName());
        printString.setContinuePrint(false);


    }
}
