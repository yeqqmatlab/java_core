package com.yqq.thread.ch02.p87;

public class Main {
    public static void main(String[] args) {

        DemoList demoList = new DemoList();
        ThreadAList a = new ThreadAList(demoList);
        a.setName("A");
        a.start();
        ThreadBList b = new ThreadBList(demoList);
        b.setName("B");
        b.start();

    }
}
