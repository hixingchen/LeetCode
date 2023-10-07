package com.hixingchen.leetCode.中等.L1641_统计字典序元音字符串的数目;

import java.util.Arrays;

/**
 * 动态规划
 */
public class Solution1 {
    public int countVowelStrings(int n) {
        int[] dp = new int[5];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < 5; j++) {
                dp[j] += dp[j - 1];
            }
        }
        return Arrays.stream(dp).sum();
    }
}