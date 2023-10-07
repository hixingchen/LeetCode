package com.hixingchen.leetCode.简单.L14_最长公共前缀;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String target = strs[0];
        int start = 0;
        int end = target.length();
        for (int i = 1; i < strs.length; i++) {
            if (end == 0){
                break;
            }
            end = Math.min(end,strs[i].length());
            int index = 0;
            while (index < end && target.charAt(index) == strs[i].charAt(index)) {
                index++;
            }
            end = index;
        }
        return target.substring(start,end);
    }
}