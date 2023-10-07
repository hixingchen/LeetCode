package com.hixingchen.leetCode.简单.L2315_统计星号;

public class Solution {
    public int countAsterisks(String s) {
        boolean temp = true;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '|'){
                temp = !temp;
            }else if (c == '*' && temp){
                result++;
            }
        }
        return result;
    }
}