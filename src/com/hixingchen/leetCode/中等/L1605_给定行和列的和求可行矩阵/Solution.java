package com.hixingchen.leetCode.中等.L1605_给定行和列的和求可行矩阵;

public class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int y = rowSum.length;
        int x = colSum.length;
        int[][] result = new int[y][x];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (colSum[j] == 0){
                    continue;
                }
                if (rowSum[i] == 0){
                    break;
                }
                result[i][j] = Math.min(rowSum[i],colSum[j]);
                rowSum[i] -= result[i][j];
                colSum[j] -= result[i][j];
            }
        }
        return result;
    }
}