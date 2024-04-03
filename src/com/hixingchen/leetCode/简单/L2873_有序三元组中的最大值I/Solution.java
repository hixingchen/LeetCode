package com.hixingchen.leetCode.简单.L2873_有序三元组中的最大值I;

public class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        int maxDiff = 0, preMax = 0;
        for (int num : nums) {
            ans = Math.max(ans,(long) maxDiff*num);
            maxDiff = Math.max(maxDiff,preMax-num);
            preMax = Math.max(preMax,num);
        }
        return ans;
    }
}