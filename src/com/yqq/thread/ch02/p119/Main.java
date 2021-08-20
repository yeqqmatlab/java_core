package com.yqq.thread.ch02.p119;

public class Main {
    public static void main(String[] args) {

        PrintString printString = new PrintString();
        printString.printStringMethod();
        /**
         * main 主线程 一直在执行
         * 程序不会向下走
         */
        System.out.println("我要停止它！ stopThread=" + Thread.currentThread().getName());
        printString.setContinuePrint(false);


    }
}
