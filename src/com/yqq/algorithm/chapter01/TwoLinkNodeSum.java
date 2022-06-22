package com.yqq.algorithm.chapter01;

/**
 * description: 两链表相加 实现加法运算
 * Created by yqq
 * 2022-06-22
 */
public class TwoLinkNodeSum {

    public static void main(String[] args) {
        //542
        LinkNode l1 = new LinkNode(2);
        l1.setNext(new LinkNode(4));
        l1.getNext().setNext(new LinkNode(5));

        //263
        LinkNode l2 = new LinkNode(3);
        l2.setNext(new LinkNode(6));
        l2.getNext().setNext(new LinkNode(2));

        Solution2 solution2 = new Solution2();
        LinkNode l3 = solution2.addTwoNumbers(l1, l2);
//        System.out.println("l3.getNext().getNext().getData() = " + l3.getNext().getNext().getData());
//        System.out.println("l3.getNext().getData() = " + l3.getNext().getData());
//        System.out.println("l3.getData() = " + l3.getData());
        int i = 0;
        while (l3 != null) {
            i = i +1;
            System.out.println("l3("+i +") = " + l3.getData());
            l3 = l3.getNext();
        }


    }

}
