package com.hixingchen.leetCode.简单.L1431_拥有最多糖果的孩子;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max,candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i]>=max-extraCandies?true:false);
        }
        return result;
    }
}