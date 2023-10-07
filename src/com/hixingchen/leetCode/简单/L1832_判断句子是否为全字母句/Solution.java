package com.hixingchen.leetCode.简单.L1832_判断句子是否为全字母句;

public class Solution {
    public boolean checkIfPangram(String sentence) {
        for (int i = 'a'; i < 'z'+1; i++) {
            if (sentence.indexOf(i) < 0){
                return false;
            }
        }
        return true;
    }
}