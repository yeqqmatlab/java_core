package com.yqq.thread.ch02.p88;

public class ThreadA extends Thread {
    private MyOneList list;

    public ThreadA(MyOneList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {

        MyService service = new MyService();
        service.addServiceMethod(list, "A");
    }
}
