package com.hixingchen.leetCode.简单.L2379_得到K个黑块的最少涂色次数;

public class Solution {
    public int minimumRecolors(String blocks, int k) {
        int max = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'B'){
                max++;
            }
        }
        int res = max;
        for (int i = k; i < blocks.length(); i++) {
            max += blocks.charAt(i) == 'B'?1:0;
            max -= blocks.charAt(i-k) == 'B'?1:0;
            res = Math.max(res,max);
        }
        return k-res;
    }
}