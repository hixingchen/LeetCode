package com.hixingchen.leetCode.简单.L231_2的幂;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1)) == 0;
    }
}