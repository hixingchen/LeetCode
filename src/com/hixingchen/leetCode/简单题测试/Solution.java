package com.hixingchen.leetCode.简单题测试;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode temp = res;
        while (true){
            ListNode temp2 = new ListNode(0);
            if (list1 == null){
                temp.next = list2;
                break;
            }
            if (list2 == null){
                temp.next = list1;
                break;
            }
            if (list1.val>list2.val){
                temp2.val = list2.val;
                list2 = list2.next;
            }else {
                temp2.val = list1.val;
                list1 = list1.next;
            }
            temp.next = temp2;
            temp = temp2;
        }
        return res.next;
    }
}