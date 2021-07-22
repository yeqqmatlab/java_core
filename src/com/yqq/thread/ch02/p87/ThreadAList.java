package com.yqq.thread.ch02.p87;

public class ThreadAList extends Thread{

    private DemoList list;

    public ThreadAList(DemoList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {

            list.add("threadAList" + (i+1));

        }
    }
}
