package com.hixingchen.leetCode.简单.L2389_和有限的最长子序列;

import java.util.Arrays;

public class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] answer = new int[queries.length];
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        for (int i = 0; i < queries.length; i++) {
            int left = -1;
            int right = nums.length-1;
            while (right>left){
                int center = (right+left+1)/2;
                if (nums[center]>queries[i]){
                    right = center-1;
                }else {
                    left = center;
                }
            }
            answer[i] = left+1;
        }
        return answer;
    }
}