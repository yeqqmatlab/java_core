package com.yqq.thread.ch02.p67;

/**
 * sub print i=9
 * main print i=8
 * sub print i=7
 * main print i=6
 * sub print i=5
 * main print i=4
 * sub print i=3
 * main print i=2
 * sub print i=1
 * main print i=0
 */
public class Run {
    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.start();


    }

}
