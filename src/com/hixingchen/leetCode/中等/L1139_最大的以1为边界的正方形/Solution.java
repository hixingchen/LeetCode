package com.hixingchen.leetCode.中等.L1139_最大的以1为边界的正方形;

/**
 * 动态规划
 */
public class Solution {
    public int largest1BorderedSquare(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        int[][] left = new int[x+1][y+1];
        int[][] up = new int[x+1][y+1];
        int result = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (grid[i][j] == 1){
                    left[i+1][j+1] = left[i+1][j]+1;
                    up[i+1][j+1] = up[i][j+1]+1;
                    int min = Math.min(left[i+1][j+1],up[i+1][j+1]);
                    while(left[i-min+2][j+1]<min||up[i+1][j-min+2]<min){
                        min--;
                    }
                    result = Math.max(min,result);
                }
            }
        }
        return result;
    }
}