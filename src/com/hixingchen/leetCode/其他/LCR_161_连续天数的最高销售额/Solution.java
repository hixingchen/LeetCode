package com.hixingchen.leetCode.其他.LCR_161_连续天数的最高销售额;

/**
 * 动态规划
 */
public class Solution {
    public int maxSales(int[] sales) {
        int pre = 0, maxAns = sales[0];
        for (int x : sales) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}