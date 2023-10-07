package com.hixingchen.leetCode.简单.L1_两数之和;

import java.util.HashMap;
import java.util.Map;

/**
 * 利用哈希查询
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target-nums[i])){
                return new int[]{i,hashtable.get(target-nums[i])};
            }
            hashtable.put(nums[i],i);
        }
        return null;
    }
}