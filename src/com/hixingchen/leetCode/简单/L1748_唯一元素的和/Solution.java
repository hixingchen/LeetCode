package com.hixingchen.leetCode.简单.L1748_唯一元素的和;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> target = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            target.put(nums[i],target.getOrDefault(nums[i],0)+1);
        }
        for (int key:target.keySet()){
            if (target.get(key) == 1){
                result += key;
            }
        }
        return result;
    }
}