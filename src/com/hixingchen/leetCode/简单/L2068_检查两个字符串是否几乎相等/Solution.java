package com.hixingchen.leetCode.简单.L2068_检查两个字符串是否几乎相等;

public class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] target = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            target[word1.charAt(i)-'a']--;
        }
        for (int i = 0; i < word2.length(); i++) {
            target[word2.charAt(i)-'a']++;
        }
        for (int i = 0; i < target.length; i++) {
            if (Math.abs(target[i])>3){
                return false;
            }
        }
        return true;
    }
}