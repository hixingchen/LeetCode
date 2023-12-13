package com.hixingchen.leetCode.简单题测试;

import java.util.*;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums1.length];
        Map<Integer,Integer> target = new HashMap<>();
        target.put(nums2[nums2.length-1],-1);
        stack.push(nums2[nums2.length-1]);
        for (int i = nums2.length - 2; i >= 0; i--) {
            while (stack.size() > 0 && stack.peek() < nums2[i]){
                stack.pop();
            }
            if (stack.size() == 0){
                target.put(nums2[i],-1);
            }else {
                target.put(nums2[i],stack.peek());
            }
            stack.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            result[i] = target.get(nums1[i]);
        }
        return result;
    }
}