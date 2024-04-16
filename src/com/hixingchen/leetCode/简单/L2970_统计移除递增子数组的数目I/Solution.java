package com.hixingchen.leetCode.简单.L2970_统计移除递增子数组的数目I;

public class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i<n-1 && nums[i]<nums[i+1]){
            i++;
        }
        if (i == n-1){
            return n*(n+1)/2;
        }
        int ans = i+2;
        for (int j = n-1; j == n-1 || nums[j]<nums[j+1]; j--) {
            while (i>=0 && nums[i]>=nums[j]){
                i--;
            }
            ans += i+2;
        }
        return ans;
    }
}