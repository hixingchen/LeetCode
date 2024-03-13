package com.hixingchen.leetCode.简单题测试;

import java.util.*;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> target = new Stack<>();
        ListNode second = head;
        while (true){
            target.add(head.val);
            if (second.next == null){
                target.pop();
                break;
            }else if (second.next.next == null){
                break;
            }else {

                second = second.next.next;
                head = head.next;
            }
        }
        while (!target.isEmpty()){
            head = head.next;
            if (head.val != target.pop()){
                return false;
            }
        }
        return true;
    }
}