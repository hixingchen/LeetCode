package com.hixingchen.leetCode.其他.礼物的最大价值;

public class Solution {
    public int maxValue(int[][] grid) {
        int y = grid.length;
        int x = grid[0].length;
        int[][] target = new int[y][x];
        target[0][0] = grid[0][0];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                target[i][j] = Math.max(i>0?target[i-1][j]:0,j>0?target[i][j-1]:0) + grid[i][j];
            }
        }
        return target[y-1][x-1];
    }
}