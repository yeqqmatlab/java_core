package com.yqq.algorithm.chapter01;

/**
 * description:
 * Created by yqq
 * 2022-06-22
 */
public class LinkNode {

    private int data;

    private LinkNode next;

    public LinkNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }
}
