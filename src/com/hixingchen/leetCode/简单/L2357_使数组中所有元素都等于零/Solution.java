package com.hixingchen.leetCode.简单.L2357_使数组中所有元素都等于零;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> target = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                target.add(nums[i]);
            }
        }
        return target.size();
    }
}