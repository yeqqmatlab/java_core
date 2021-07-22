package com.yqq.thread.ch02.p87;

import java.util.ArrayList;
import java.util.List;

public class DemoList {

    private List list = new ArrayList();

    public synchronized void add(String username){
        System.out.println("ThreadName"+Thread.currentThread().getName()+ " run add method !");
        list.add(username);
        System.out.println("ThreadName"+Thread.currentThread().getName()+ " exit add method !");
    }

    public synchronized int getSize(){

        System.out.println("ThreadName"+Thread.currentThread().getName()+ " run getSize method !");
        int size = list.size();
        System.out.println("ThreadName"+Thread.currentThread().getName()+ " exit getSize method !");
        return size;
    }

}
