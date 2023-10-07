package com.hixingchen.leetCode.其他.回文链表;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();
        ListNode currentNode = head;
        while (currentNode != null){
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }
        for (int i = 0,j = vals.size()-1; i < j; i++,j--) {
            if (!vals.get(i).equals(vals.get(j))){
                return false;
            }
        }
        return true;
    }
}