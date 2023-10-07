package com.hixingchen.leetCode.简单.L1822_数组元素积的符号;

public class Solution {
    public int arraySign(int[] nums) {
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                result *= 1;
            } else if (nums[i] < 0) {
                result *= -1;
            }else {
                result = 0;
                break;
            }
        }
        return result;
    }
}