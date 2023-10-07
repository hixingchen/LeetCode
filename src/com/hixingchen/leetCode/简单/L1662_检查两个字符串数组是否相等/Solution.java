package com.hixingchen.leetCode.简单.L1662_检查两个字符串数组是否相等;

public class Solution {
    /**
     * 利用String.join拼接字符数组
     */
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}