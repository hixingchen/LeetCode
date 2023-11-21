package com.hixingchen.leetCode.简单.L459_重复的子字符串;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        return (s+s).indexOf(s,1) != s.length();
    }
}