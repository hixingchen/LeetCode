package com.hixingchen.leetCode.简单.L2180_统计各位数字之和为偶数的整数个数;

public class Solution {
    public int countEven(int num) {
        int y = num / 10, x = num % 10;
        int res = y * 5, ySum = 0;
        while (y != 0) {
            ySum += y % 10;
            y /= 10;
        }
        if (ySum % 2 == 0) {
            res += x / 2 + 1;
        } else {
            res += (x + 1) / 2;
        }
        return res - 1;
    }
}
