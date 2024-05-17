package com.hixingchen.leetCode.简单.L1863_找出所有子集的异或总和再求和;

/**
 * 按位考虑 + 二项式展开(比较难理解)
 */
public class Solution {
    public int subsetXORSum(int[] nums) {
        int res = 0;
        int n = nums.length;
        for (int num : nums) {
            res |= num;
        }
        return res << (n-1);
    }
}