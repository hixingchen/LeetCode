package com.hixingchen.leetCode.简单.L1758_生成交替二进制字符串的最少操作数;


public class Solution {
    public int minOperations(String s) {
        int length = 0;
        for (int i = 0; i < s.length(); i+=2) {
            if (s.charAt(i) == '1'){
                length++;
            }
        }
        for (int i = 1; i < s.length(); i+=2) {
            if (s.charAt(i) == '0'){
                length++;
            }
        }
        return Math.min(length,s.length()-length);
    }
}