package com.hixingchen.leetCode.简单.L203_移除链表元素;

/**
 * 递归
 */
public class Solution1 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode begin = new ListNode();
        begin.next = head;
        ListNode temp = begin;
        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        return begin.next;
    }
}