package com.hixingchen.leetCode.简单.L2848_与车相交的点;

import java.util.List;

public class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] diff = new int[102];
        for (List<Integer> p : nums) {
            diff[p.get(0)]++;
            diff[p.get(1) + 1]--;
        }
        int ans = 0, s = 0;
        for (int d : diff) {
            s += d;
            if (s > 0) {
                ans++;
            }
        }
        return ans;
    }
}