package com.hixingchen.leetCode.中等.L1641_统计字典序元音字符串的数目;

/**
 * 动态规划
 */
public class Solution {
    static int[][] target = new int[50][5];
    static {
        for (int i = 0; i < 5; i++) {
            target[0][i] = i+1;
        }
        for (int i = 1; i < 50; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k <= j; k++) {
                    target[i][j] += target[i-1][k];
                }
            }
        }
    }
    public int countVowelStrings(int n) {
        return target[n-1][4];
    }
}