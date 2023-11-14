package com.hixingchen.leetCode.其他.LCR_019_验证回文串II;

public class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while (j-i>1){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
                continue;
            }
            return validPalindrome(s,i,j-1) || validPalindrome(s,i+1,j);
        }
        return true;
    }
    private boolean validPalindrome(String s, int low, int high) {
        for (int i = low, j = high; i < j; ++i, --j) {
            char c1 = s.charAt(i), c2 = s.charAt(j);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }
}