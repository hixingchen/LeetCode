package com.hixingchen.leetCode.简单.L2928_给小朋友们分糖果I;

public class Solution {
    public int distributeCandies(int n, int limit) {
        return c2(n + 2) - 3 * c2(n - limit + 1) + 3 * c2(n - 2 * limit) - c2(n - 3 * limit - 1);
    }

    private int c2(int n) {
        return n > 1 ? n * (n - 1) / 2 : 0;
    }
}