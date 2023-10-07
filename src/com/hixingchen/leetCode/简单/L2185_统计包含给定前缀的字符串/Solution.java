package com.hixingchen.leetCode.简单.L2185_统计包含给定前缀的字符串;

public class Solution {
    public int prefixCount(String[] words, String pref) {
        int res = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                res++;
            }
        }
        return res;
    }
}