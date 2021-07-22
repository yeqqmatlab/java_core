package com.yqq.thread.ch02.p90;

public class ThreadB extends Thread {
    private MyOneList list;

    public ThreadB(MyOneList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {

        MyService service = new MyService();
        service.addServiceMethod(list, "B");
    }
}
