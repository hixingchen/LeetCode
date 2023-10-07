package com.hixingchen.leetCode.简单.L2500_删除每行中的最大值;

import java.util.Arrays;

public class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }
        int result = 0;
        for (int i = 0; i < grid[0].length; i++) {
            int temp = 0;
            for (int j = 0; j < grid.length; j++) {
                temp = Math.max(temp,grid[j][i]);
            }
            result+=temp;
        }
        return result;
    }
}