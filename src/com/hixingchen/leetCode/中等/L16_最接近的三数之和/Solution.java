package com.hixingchen.leetCode.中等.L16_最接近的三数之和;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int result = Integer.MAX_VALUE;
        int temp = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            int j = i+1,k = len-1;
            while (j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if (sum == target){
                    return sum;
                } else if (sum > target) {
                    k--;
                }else {
                    j++;
                }
                if (Math.abs(target-sum)<temp){
                    temp = Math.abs(target-sum);
                    result = sum;
                }
            }
        }
        return result;
    }
}