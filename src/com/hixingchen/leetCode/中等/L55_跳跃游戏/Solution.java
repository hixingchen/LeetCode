package com.hixingchen.leetCode.中等.L55_跳跃游戏;

public class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int canJumpIndex = 0;
        for (int i = 0; i < len; i++) {
            canJumpIndex = canJumpIndex>(i+nums[i])?canJumpIndex:(i+nums[i]);
            if (canJumpIndex >= (len-1)){
                return true;
            }
            if (canJumpIndex == i){
                return false;
            }
        }
        return false;
    }
}