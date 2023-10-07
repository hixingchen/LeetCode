package com.hixingchen.leetCode.简单.L1005_K次取反后最大化的数组和;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> targetQueue = new PriorityQueue<>((o1, o2) -> o1-o2);
        for (int i = 0; i < nums.length; i++) {
            targetQueue.offer(nums[i]);
        }
        for (int i = 0; i < k; i++) {
            Integer poll = targetQueue.poll();
            targetQueue.offer(-poll);
        }
        int sum = 0;
        while (targetQueue.size() > 0){
            sum += targetQueue.poll();
        }
        return sum;
    }
}