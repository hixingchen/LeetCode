package com.hixingchen.leetCode.其他.LCR_101_分割等和子集;

public class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        if (n < 2){
            return false;
        }
        int sum = 0;
        int maxNum = 0;
        for (int num : nums) {
            sum += num;
            maxNum = Math.max(maxNum,num);
        }
        if (sum % 2 != 0){
            return false;
        }
        int target = sum/2;
        if (maxNum>target){
            return false;
        }
        boolean[] dp = new boolean[target+1];
        dp[0] = true;
        for (int i = 0; i < n; i++) {
            for (int j = target; j >= 0; j--) {
                if (nums[i]+j > target){
                    continue;
                }else {
                    dp[nums[i]+j] |= dp[j];
                }
            }
        }
        return dp[target];
    }
}