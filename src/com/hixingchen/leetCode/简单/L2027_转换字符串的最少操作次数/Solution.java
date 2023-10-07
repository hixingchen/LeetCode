package com.hixingchen.leetCode.简单.L2027_转换字符串的最少操作次数;

public class Solution {
    public int minimumMoves(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'X'){
                i+=2;
                result++;
            }
        }
        return result;
    }
}