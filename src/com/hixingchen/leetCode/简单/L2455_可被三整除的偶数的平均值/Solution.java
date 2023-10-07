package com.hixingchen.leetCode.简单.L2455_可被三整除的偶数的平均值;

public class Solution {
    public int averageValue(int[] nums) {
        int total = 0;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%6==0){
                total += nums[i];
                num ++;
            }
        }
        return num == 0?0:total/num;
    }
}