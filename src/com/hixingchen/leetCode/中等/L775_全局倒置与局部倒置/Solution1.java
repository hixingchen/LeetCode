package com.hixingchen.leetCode.中等.L775_全局倒置与局部倒置;

/**
 * 归纳法
 */
public class Solution1 {
    public boolean isIdealPermutation(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] ) > 1+i || (nums[i]) < i-1) {
                return false;
            }
        }
        return true;
    }
}