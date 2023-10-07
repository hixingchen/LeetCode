package com.hixingchen.leetCode.简单.L2544_交替数字和;

public class Solution {
    public int alternateDigitSum(int n) {
        int result = 0;
        int sign = 1;
        while (n>0){
            result += sign*(n%10);
            sign = -sign;
            n /= 10;
        }
        return -sign*result;
    }
}