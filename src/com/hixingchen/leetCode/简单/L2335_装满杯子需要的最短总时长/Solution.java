package com.hixingchen.leetCode.简单.L2335_装满杯子需要的最短总时长;

public class Solution {
    public int fillCups(int[] amount) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < amount.length; i++) {
            max = Math.max(max,amount[i]);
            sum += amount[i];
        }
        return max*2>sum?max:sum/2+sum%2;
    }
}