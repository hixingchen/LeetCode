package com.hixingchen.leetCode.困难.L1250_检查好数组;

public class Solution {
    public boolean isGoodArray(int[] nums) {
        int target = nums[0];
        for (int i = 1; i < nums.length; i++) {
            target = gcd(target,nums[i]);
        }
        return target == 1;
    }
    private int gcd(int num1,int num2){
        if (num1 == 0){
            return num2;
        }
        num2 = num2 %num1;
        return gcd(num2,num1);
    }
}