package com.hixingchen.leetCode.中等.L1669_合并两个链表;

public class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode list2End = list2;
        ListNode begin = new ListNode(0,list1);
        while(true){
            if (list2End.next != null){
                list2End = list2End.next;
            }else {
                break;
            }
        }
        ListNode beforeA = null;
        ListNode afterB = null;
        ListNode temp = begin;
        int count = 0;
        while (true){
            if (count == a){
                beforeA = temp;
            }
            if (count == b){
                afterB = temp.next.next;
                break;
            }
            temp = temp.next;
            count++;
        }
        beforeA.next = list2;
        list2End.next = afterB;
        return begin.next;
    }
}