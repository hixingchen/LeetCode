package com.hixingchen.leetCode.中等.L1144_递减元素使数组呈锯齿状;

public class Solution {
    public int movesToMakeZigzag(int[] nums) {
        return Math.min(help(nums,0),help(nums,1));
    }
    public int help(int[] nums,int pos){
        int res = 0;
        for (int i = pos; i < nums.length; i+=2) {
            int a = 0;
            if (i>0){
                a = Math.max(a,nums[i]-nums[i-1]+1);
            }
            if (i<nums.length-1){
                a = Math.max(a,nums[i]-nums[i+1]+1);
            }
            res+=a;
        }
        return res;
    }
}