package com.hixingchen.leetCode.简单.L448_找到所有数组中消失的数字;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            int i = (num-1) % len;
            nums[i] += len;
        }
        for (int i = 0; i < len; i++) {
            if(nums[i] <= len){
                result.add(i+1);
            }
        }
        return result;
    }
}