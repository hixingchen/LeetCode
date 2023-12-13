package com.hixingchen.leetCode.简单.L496_下一个更大元素I;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 单调栈 + 哈希表
 */
public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums1.length];
        Map<Integer,Integer> target = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() < nums2[i]){
                stack.pop();
            }
            target.put(nums2[i],stack.isEmpty()?-1:stack.peek());
            stack.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            result[i] = target.get(nums1[i]);
        }
        return result;
    }
}