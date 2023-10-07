package com.hixingchen.leetCode.简单.L1816_截断句子;

public class Solution {
    public String truncateSentence(String s, int k) {
        int index = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                k--;
                if (k==0){
                    index = i;
                    break;
                }
            }
        }
        return s.substring(0,index);
    }
}