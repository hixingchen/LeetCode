package com.hixingchen.leetCode.简单.L3083_字符串及其反转中是否存在同一子字符串;

public class Solution {
    public boolean isSubstringPresent(String s) {
        boolean[][] target = new boolean[26][26];
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            int x = chars[i-1]-'a';
            int y = chars[i]-'a';
            target[x][y] = true;
            if (target[y][x]){
                return true;
            }
        }
        return false;
    }
}