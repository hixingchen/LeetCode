package com.hixingchen.leetCode.简单题测试;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        int maxDiff = 0, preMax = 0;
        for (int num : nums) {
            ans = Math.max(ans,(long) maxDiff*num);
            maxDiff = Math.max(maxDiff,preMax-num);
            preMax = Math.max(preMax,num);
        }
        return ans;
    }
}