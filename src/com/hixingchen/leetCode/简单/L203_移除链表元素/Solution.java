package com.hixingchen.leetCode.简单.L203_移除链表元素;

/**
 * 递归
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return null;
        head.next=removeElements(head.next,val);
        if(head.val==val){
            return head.next;
        }else{
            return head;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}