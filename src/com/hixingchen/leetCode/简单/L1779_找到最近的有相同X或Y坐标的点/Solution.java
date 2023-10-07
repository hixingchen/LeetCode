package com.hixingchen.leetCode.简单.L1779_找到最近的有相同X或Y坐标的点;

public class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int result = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y){
                if (result > Math.abs(points[i][0] - x + points[i][1] - y)){
                    result = Math.abs(points[i][0] - x + points[i][1] - y);
                    index = i;
                }
                if (result == 0){
                    return index;
                }
            }
        }
        return index;
    }
}