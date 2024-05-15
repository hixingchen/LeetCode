package com.hixingchen.leetCode.简单题测试;

public class Solution {
    public int[] evenOddBit(int n) {
        int temp = n;
        int res = 0;
        while (n>0){
            if ((n&1) == 1){
                res++;
            }
            n >>= 2;
        }
        return new int[]{res,Integer.bitCount(temp)-res};
    }
}