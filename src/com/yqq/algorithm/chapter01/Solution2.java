package com.yqq.algorithm.chapter01;

/**
 * description: 链表加法运算 l3 <-- l1 + l2
 * Created by yqq
 * 2022-06-22
 */
public class Solution2 {
    public LinkNode addTwoNumbers(LinkNode l1, LinkNode l2){
        LinkNode head = new LinkNode(-1); // 存储链表
        LinkNode curMove = head; //移动指针
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.getData();
                l1 = l1.getNext();
            }
            if (l2 != null) {
                sum += l2.getData();
                l2 = l2.getNext();
            }
            //与10进1位
            carry = sum / 10;
            //创建新节点
            curMove.setNext(new LinkNode(sum % 10));
            //链表移动一位
            curMove = curMove.getNext();

        }
        //最后判断carry是否需要进位
        if (carry > 0) {
            curMove.setNext(new LinkNode(carry));
        }
        return head.getNext();
    }
}
