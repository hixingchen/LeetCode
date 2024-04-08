package com.hixingchen.leetCode.简单.L3079_求出加密整数的和;

public class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int res = 0;
        for (int num : nums) {
            int a = 0;
            int b = 0;
            while (num > 0){
                a = a*10+1;
                b = Math.max(b,num%10);
                num /= 10;
            }
            res += a*b;
        }
        return res;
    }
}