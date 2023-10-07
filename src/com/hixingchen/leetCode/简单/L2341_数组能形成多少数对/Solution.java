package com.hixingchen.leetCode.简单.L2341_数组能形成多少数对;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer,Boolean> target = new HashMap<>();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            target.put(nums[i],!target.getOrDefault(nums[i],false));
            if (!target.get(nums[i])){
                res++;
            }
        }
        return new int[]{res,nums.length-2*res};
    }
}