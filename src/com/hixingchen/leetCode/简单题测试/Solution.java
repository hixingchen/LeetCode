package com.hixingchen.leetCode.简单题测试;

import java.util.*;

public class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int res = 0;
        int[] count = new int[2];
        count[s.charAt(0) == '1'?1:0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0' && s.charAt(i-1) == '1'){
                count[0] = 1;
                count[1] = 0;
            }else if (s.charAt(i) == '0'){
                count[0]++;
            }else {
                count[1]++;
            }
            res = Math.max(res,Math.min(count[0],count[1]));
        }
        return res*2;
    }
}