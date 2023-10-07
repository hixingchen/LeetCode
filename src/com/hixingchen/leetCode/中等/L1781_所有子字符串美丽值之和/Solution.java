package com.hixingchen.leetCode.中等.L1781_所有子字符串美丽值之和;

public class Solution {
    public int beautySum(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] temp = new int[26];
            int max = 0;
            for (int j = i; j < s.length(); j++) {
                temp[s.charAt(j)-'a']++;
                max = Math.max(max,temp[s.charAt(j)-'a']);
                int min = max;
                for (int k = 0; k < temp.length; k++) {
                    if (temp[k]>0){
                        min = Math.min(min,temp[k]);
                    }
                }
                result = result+max-min;
            }
        }
        return result;
    }
}