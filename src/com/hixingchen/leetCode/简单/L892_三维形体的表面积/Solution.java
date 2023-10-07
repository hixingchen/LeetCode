package com.hixingchen.leetCode.简单.L892_三维形体的表面积;

public class Solution {
    int m,n;
    public int surfaceArea(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result += grid[i][j]*6;
                if (grid[i][j]>1){
                    result -= (grid[i][j]-1)*2;
                }
                if (i-1>=0){
                    result -= Math.min(grid[i][j],grid[i-1][j]);
                }
                if (j-1>=0){
                    result -= Math.min(grid[i][j],grid[i][j-1]);
                }
                if (i+1<m){
                    result -= Math.min(grid[i][j],grid[i+1][j]);
                }
                if (j+1<n){
                    result -= Math.min(grid[i][j],grid[i][j+1]);
                }
            }
        }
        return result;
    }
}