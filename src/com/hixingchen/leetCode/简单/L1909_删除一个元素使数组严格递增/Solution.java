package com.hixingchen.leetCode.简单.L1909_删除一个元素使数组严格递增;

public class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int pre = 0;
        int cur = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]<=nums[i-1]){
                if (cur != 0){
                    return false;
                }
                pre = i-1;
                cur = i;
            }
        }
        if (pre == 0 || cur == nums.length-1 || nums.length == 2){
            return true;
        }
        boolean res = false;
        if (pre != 0){
            res |= (nums[pre+1]>nums[pre-1]);
        }
        if (cur < nums.length-1){
            res |= (nums[cur+1]>nums[cur-1]);
        }
        return res;
    }
}