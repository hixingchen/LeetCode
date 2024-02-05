package com.hixingchen.leetCode.简单.L2475_数组中不等三元组的数目;

import java.util.Arrays;

/**
 * 排序
 */
public class Solution1 {
    public int unequalTriplets(int[] nums) {
        Arrays.sort(nums);
        int res = 0, n = nums.length;
        for (int i = 0, j = 0; i < n; i = j) {
            while (j < n && nums[j] == nums[i]) {
                j++;
            }
            res += i * (j - i) * (n - j);
        }
        return res;
    }
}