package com.hixingchen.leetCode.中等.L1753_移除石子的最大得分;

/**
 * 数学解法
 */
public class Solution {
    public int maximumScore(int a, int b, int c) {
        int result = 0;
        int max = Math.max(a,b);
        max = Math.max(max,c);
        if (max*2 >= (a+b+c)){
            return a+b+c-max;
        }
        return (a+b+c)/2;
    }
}
