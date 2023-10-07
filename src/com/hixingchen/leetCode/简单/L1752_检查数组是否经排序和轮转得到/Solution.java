package com.hixingchen.leetCode.简单.L1752_检查数组是否经排序和轮转得到;

public class Solution {
    public boolean check(int[] nums) {
        int result = 0;
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i] < nums[i-1] && ++result > 1){
                return false;
            }
        }
        return result == 0 || (result == 1 && nums[len-1] <= nums[0]);
    }
}