package com.hixingchen.leetCode.其他.LCP_07_传递信息;

/**
 * 动态规划
 */
public class Solution {
    public int numWays(int n, int[][] relation, int k) {
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 0; i < k; i++) {
            int[] temp = new int[n];
            for (int[] edge : relation) {
                temp[edge[1]]+=dp[edge[0]];
            }
            dp = temp;
        }
        return dp[n-1];
    }
}