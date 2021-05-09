package com.yqq.designPatterns.iterator.v2;

public class Main {
    public static void main(String[] args) {
        LinkedList_ linkedList = new LinkedList_();
        for (int i = 0; i <15; i++) {
            linkedList.add(new String("s"+i));

        }
        System.out.println(linkedList.size());


    }
}

class LinkedList_{

    Node head = null;
    Node tail = null;

    private int size = 0;

    public void add(Object o){
        Node node = new Node(o);
        node.next = null;
        if (head == null) {
            head = node;
            tail = node;
        }

        tail.next = node;
        tail = node;
        size++;

    }





    private class Node{

        private Object obj;

        Node next;

        public Node(Object obj) {
            this.obj = obj;
        }
    }

    public int size(){
        return size;
    }
}
