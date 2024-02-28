package com.hixingchen.leetCode.简单.L1893_检查是否区域内所有整数都被覆盖;

public class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] diff = new int[52];   // 差分数组
        for (int[] range : ranges) {
            ++diff[range[0]];
            --diff[range[1] + 1];
        }
        // 前缀和
        int curr = 0;
        for (int i = 1; i <= 50; ++i) {
            curr += diff[i];
            if (i >= left && i <= right && curr == 0) {
                return false;
            }
        }
        return true;
    }
}