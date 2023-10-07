package com.hixingchen.leetCode.中等.L1664_生成平衡数组的方案数;

class Solution {
    public int waysToMakeFair(int[] nums) {
        int[] dp = new int[nums.length+1];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i%2==0){
                dp[0]+=nums[i];
            }else {
                dp[0]-=nums[i];
            }
        }
        dp[1] = dp[0] - nums[0];
        if (dp[1] == 0){
            result++;
        }
        for (int i = 1; i < nums.length; i++) {
            if (i%2 == 0){
                dp[i+1] = dp[i]-nums[i]+nums[i-1];
            }else {
                dp[i+1] = dp[i]+nums[i]-nums[i-1];
            }
            if (dp[i+1]==0){
                result++;
            }
        }
        return result;
    }
}
