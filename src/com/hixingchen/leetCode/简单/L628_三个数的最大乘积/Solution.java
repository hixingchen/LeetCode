package com.hixingchen.leetCode.简单.L628_三个数的最大乘积;

import java.util.Arrays;

public class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(nums[len-1]*nums[len-2]*nums[len-3],nums[0]*nums[1]*nums[len-1]);
    }
}