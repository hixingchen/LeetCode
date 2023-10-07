package com.hixingchen.leetCode.简单.L2367_算术三元组的数目;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        int ans = 0;
        for (int x : nums) {
            if (set.contains(x + diff) && set.contains(x + 2 * diff)) {
                ans++;
            }
        }
        return ans;
    }
}