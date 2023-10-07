package com.hixingchen.leetCode.简单.L2395_和相等的子数组;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> target = new HashSet<>();
        for (int i = 1; i < nums.length; i++) {
            int sum = nums[i] + nums[i - 1];
            if (!target.add(sum)){
                return true;
            }
        }
        return false;
    }
}