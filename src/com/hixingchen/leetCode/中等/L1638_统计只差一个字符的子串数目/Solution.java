package com.hixingchen.leetCode.中等.L1638_统计只差一个字符的子串数目;

public class Solution {
    public int countSubstrings(String s, String t) {
        int m = s.length();
        int n = t.length();
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int temp = 0;
                for (int k = 0; i+k < m && j+k<n; k++) {
                    temp += (s.charAt(i+k) != t.charAt(j+k))?1:0;
                    if (temp>1){
                        break;
                    }
                    if (temp == 1){
                        res++;
                    }
                }
            }
        }
        return res;
    }
}