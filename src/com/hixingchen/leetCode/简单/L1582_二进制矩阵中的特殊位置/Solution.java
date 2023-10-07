package com.hixingchen.leetCode.简单.L1582_二进制矩阵中的特殊位置;

public class Solution {
    public int numSpecial(int[][] mat) {
        int[] xValues = new int[mat[0].length];
        int[] yValues = new int[mat.length];
        int result = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                yValues[i] += mat[i][j];
                xValues[j] += mat[i][j];
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1 && (yValues[i]+xValues[j])==2){
                    result++;
                }
            }
        }
        return result;
    }
}