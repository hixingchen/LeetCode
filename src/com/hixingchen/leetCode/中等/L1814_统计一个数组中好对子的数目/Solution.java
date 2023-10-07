package com.hixingchen.leetCode.中等.L1814_统计一个数组中好对子的数目;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    int result = 0;
    public int countNicePairs(int[] nums) {
        int[] reverseNums = new int[nums.length];
        Map<Integer,Integer> target = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer reverse = nums[i] - Integer.valueOf(new StringBuilder(nums[i] + "").reverse().toString());
            target.put(reverse,target.getOrDefault(reverse,0)+1);
            result = (result+target.get(reverse)-1)%1000000007;
        }
        return result;
    }
}