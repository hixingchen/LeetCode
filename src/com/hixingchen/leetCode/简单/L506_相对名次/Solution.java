package com.hixingchen.leetCode.简单.L506_相对名次;

import java.util.Arrays;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        int len = score.length;
        int[][] target = new int[len][2];
        String[] desc = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        String[] result = new String[len];
        for (int i = 0; i < target.length; i++) {
            target[i][0] = score[i];
            target[i][1] = i;
        }
        Arrays.sort(target,(a, b)->b[0]-a[0]);
        for (int i = 0; i < target.length; i++) {
            if (i >= 3) {
                result[target[i][1]] = Integer.toString(i + 1);
            } else {
                result[target[i][1]] = desc[i];
            }
        }
        return result;
    }
}