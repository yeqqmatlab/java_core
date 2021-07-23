package com.yqq.thread.ch02.p87;

public class ThreadCList extends Thread{

    private DemoList list;

    public ThreadCList(DemoList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        int size = list.getSize();
        System.out.println("size = " + size);
    }
}
