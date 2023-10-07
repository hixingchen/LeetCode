package com.hixingchen.leetCode.中等.L1769_移动所有球到每个盒子所需的最小操作数;

public class Solution {
    public int[] minOperations(String boxes) {
        int length = boxes.length();
        int[] dp = new int[length];
        int left = boxes.charAt(0) == '1'?1:0;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (boxes.charAt(i) == '1'){
                sum++;
                dp[0] += i;
            }
        }
        for (int i = 1; i < length; i++) {
            dp[i] = dp[i-1] + left - (sum - left);
            if (boxes.charAt(i) == '1'){
                left++;
            }
        }
        return dp;
    }
}