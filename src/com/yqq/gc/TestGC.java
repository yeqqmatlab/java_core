package com.yqq.gc;

/**
 * created by yqq 2020/4/13
 */
public class TestGC {
    public static void main(String[] args) {
        System.out.println("active...");
        System.gc();
        System.out.println("dead...");


    }
}
