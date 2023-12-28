package com.hixingchen.leetCode.简单.L234_回文链表;

import java.util.Stack;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> target = new Stack<>();
        ListNode first = head;
        ListNode second = head;
        target.push(first.val);
        while (second.next != null && second.next.next != null){
            first = first.next;
            second = second.next.next;
            target.push(first.val);
        }
        if (second.next == null){
            target.pop();
        }
        while (target.size()>0){
            first = first.next;
            if (target.pop() != first.val){
                return false;
            }
        }
        return true;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}