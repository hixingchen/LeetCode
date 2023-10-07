package com.hixingchen.leetCode.困难.L1163_按字典序排在最后的子串;

public class Solution {
    public String lastSubstring(String s) {
        int index = 0;
        int step = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(index)<s.charAt(i)){
                index = i;
                step = 0;
                continue;
            }
            if (s.charAt(index + step) == s.charAt(i)){
                step++;
                continue;
            }
            if (s.charAt(index + step) > s.charAt(i)){
                step = 0;
            }
            if (s.charAt(index + step) < s.charAt(i)){
                index = i - step;
                i = index;
                step = 0;
            }
        }
        return s.substring(index);
    }
}