package com.hixingchen.leetCode.中等.L2_两数相加;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        int temp = 0;
        ListNode tempNode = result;
        while (l1 != null || l2 != null){
            int l1val = l1 == null?0:l1.val;
            int l2val = l2 == null?0:l2.val;
            int sum = l1val+l2val+temp;
            tempNode.val = sum>=0?sum%10:sum;
            temp = sum/10;
            l1 = l1 == null?null:l1.next;
            l2 = l2 == null?null:l2.next;
            if(l1 != null || l2 != null){
                tempNode.next = new ListNode();
                tempNode = tempNode.next;
            }else if(temp == 1){
                tempNode.next = new ListNode();
                tempNode.next.val = 1;
            }
        }
        return result;
    }
}