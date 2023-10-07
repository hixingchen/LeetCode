package com.hixingchen.leetCode.中等.L775_全局倒置与局部倒置;

/**
 * 维护后缀最小值
 */
public class Solution {
    public boolean isIdealPermutation(int[] nums) {
        int n = nums.length, minSuff = nums[n - 1];
        for (int i = n - 3; i >= 0; i--) {
            if (nums[i] > minSuff) {
                return false;
            }
            minSuff = Math.min(minSuff, nums[i + 1]);
        }
        return true;
    }
}
