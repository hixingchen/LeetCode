package com.hixingchen.leetCode.中等.L1039_多边形三角剖分的最低得分;

import java.util.HashMap;
import java.util.Map;

/**
 * 动态规划
 */
public class Solution {
    int[] values;
    int n;
    Map<Integer,Integer> target = new HashMap<>();
    public int minScoreTriangulation(int[] values) {
        this.values = values;
        n = values.length;
        return dp(0,n-1);
    }

    private int dp(int i, int j) {
        if (i+2>j){
            return 0;
        }
        if (i+2 == j){
            return values[i] * values[i + 1] * values[j];
        }
        int key = i*n+j;
        if (!target.containsKey(key)){
            int min = Integer.MAX_VALUE;
            for (int k = i+1; k < j; k++) {
                min = Math.min(min,values[i] * values[k] * values[j] + dp(i, k) + dp(k, j));
            }
            target.put(key,min);
        }
        return target.get(key);
    }
}