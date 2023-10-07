package com.hixingchen.leetCode.困难.L1326_灌溉花园的最少水龙头数目;

/**
 * 贪心
 */
public class Solution {
    public int minTaps(int n, int[] ranges) {
        int[] target = new int[n];
        for (int i = 0; i < ranges.length; i++) {
            int left = Math.max(i-ranges[i],0);
            int right = Math.min(i+ranges[i],n);
            for (int j = left; j < right; j++) {
                target[j] = Math.max(target[j],right);
            }
        }
        int result = 0;
        int temp = 0;
        while (temp<n){
            if (target[temp] == 0){
                return -1;
            }
            temp = target[temp];
            result++;
        }
        return result;
    }
}