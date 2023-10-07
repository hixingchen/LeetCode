package com.hixingchen.leetCode.中等.L1615_最大网络秩;

public class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        boolean[][] connection = new boolean[n][n];
        int[] target = new int[n];
        for (int i = 0; i < roads.length; i++) {
            target[roads[i][0]]++;
            target[roads[i][1]]++;
            connection[roads[i][0]][roads[i][1]] = true;
            connection[roads[i][1]][roads[i][0]] = true;
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = target[i]+target[j]-(connection[i][j]?1:0);
                result = Math.max(result,temp);
            }
        }
        return result;
    }
}