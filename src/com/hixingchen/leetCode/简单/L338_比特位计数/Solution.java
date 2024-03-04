package com.hixingchen.leetCode.简单.L338_比特位计数;

/**
 * 动态规划  最高有效位
 */
public class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        int highBit = 0;
        for (int i = 1; i <= n; i++) {
            if ((i&i-1) == 0){
                highBit = i;
            }
            bits[i] = bits[i-highBit]+1;
        }
        return bits;
    }
}