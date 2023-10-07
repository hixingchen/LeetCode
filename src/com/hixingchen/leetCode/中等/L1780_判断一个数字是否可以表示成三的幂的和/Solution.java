package com.hixingchen.leetCode.中等.L1780_判断一个数字是否可以表示成三的幂的和;

public class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n != 0){
            if (n % 3 == 2){
                return false;
            }
            n /= 3;
        }
        return true;
    }
}