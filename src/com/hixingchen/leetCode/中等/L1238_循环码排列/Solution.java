package com.hixingchen.leetCode.中等.L1238_循环码排列;

import java.util.ArrayList;
import java.util.List;

/**
 * 格雷码
 */
public class Solution {
    public List<Integer> circularPermutation(int n, int start) {
        List<Integer> target = new ArrayList<>();
        for (int i = 0; i < 1<< n; i++) {
            target.add(i^(i>>1)^start);
        }
        return target;
    }
}