package com.hixingchen.leetCode.中等.L795_区间子数组个数;

/**
 * 官方题解：计数
 * 题目转换为，最大小于right的连续子集数 - 去最大小于left的连续子集数
 * 得到的结果就是题目需要的
 */
public class Solution2 {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return count(nums, right) - count(nums, left - 1);
    }

    public int count(int[] nums, int lower) {
        int res = 0, cur = 0;
        for (int x : nums) {
            cur = x <= lower ? cur + 1 : 0;
            res += cur;
        }
        return res;
    }
}