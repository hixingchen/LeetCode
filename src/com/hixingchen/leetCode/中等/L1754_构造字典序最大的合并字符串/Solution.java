package com.hixingchen.leetCode.中等.L1754_构造字典序最大的合并字符串;

public class Solution {
    public String largestMerge(String word1, String word2) {
        StringBuilder target = new StringBuilder();
        while(true){
            if (word1.length() == 0 && word2.length() == 0){
                break;
            }
            if (word1.compareTo(word2)>0){
                target.append(word1.charAt(0));
                word1 = word1.substring(1);
            }else {
                target.append(word2.charAt(0));
                word2 = word2.substring(1);
            }
        }
        return target.toString();
    }
}