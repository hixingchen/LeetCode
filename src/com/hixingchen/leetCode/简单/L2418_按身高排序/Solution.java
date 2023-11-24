package com.hixingchen.leetCode.简单.L2418_按身高排序;

import java.util.Arrays;

public class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Integer[] heightTemp = new Integer[heights.length];
        for (int i = 0; i < heightTemp.length; i++) {
            heightTemp[i] = i;
        }
        Arrays.sort(heightTemp,(a, b)->heights[b]-heights[a]);
        String[] result = new String[names.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = names[heightTemp[i]];
        }
        return result;
    }
}