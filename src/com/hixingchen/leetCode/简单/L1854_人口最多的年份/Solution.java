package com.hixingchen.leetCode.简单.L1854_人口最多的年份;

public class Solution {
    public int maximumPopulation(int[][] logs) {
        int startYear = 1950;
        int[] target = new int[101];
        int result = 0;
        int num = 0;
        int max = 0;
        for (int[] log : logs) {
            target[log[0]-startYear]++;
            target[log[1]-startYear]--;
        }
        for (int i = 0; i < target.length; i++) {
            num+=target[i];
            if (num>max){
                max = num;
                result = i;
            }
        }
        return result+startYear;
    }
}